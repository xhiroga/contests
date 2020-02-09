import sys
from io import StringIO
from typing import Callable
from unittest import TestCase


# Thanks to SlackOverFlow
# https://stackoverflow.com/questions/38861101/how-can-i-test-the-standard-input-and-standard-output-in-python-script-with-a-un
def assertIo(self: TestCase, stdin: str, stdout: str, fun: Callable[[None], None]):
    stub_stdin(self, stdin)
    stub_stdouts(self)
    fun()
    self.assertEqual(sys.stdout.getvalue(), stdout)


def stub_stdin(self: TestCase, inputs):
    stdin = sys.stdin

    def cleanup():
        sys.stdin = stdin

    self.addCleanup(cleanup)
    sys.stdin = StringIO(inputs)


def stub_stdouts(self: TestCase):
    stderr = sys.stderr
    stdout = sys.stdout

    def cleanup():
        sys.stderr = stderr
        sys.stdout = stdout

    self.addCleanup(cleanup)
    sys.stderr = StringIO()
    sys.stdout = StringIO()
