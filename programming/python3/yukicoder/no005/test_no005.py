from unittest import TestCase

from test_utility.asserts import assertIo
from yukicoder.no005 import no005


class Test(TestCase):
    def test_case1(self):
        assertIo(
            self,
            """16
3
10 5 7""",
            "2",
            no005.solve
        )

    def test_case2(self):
        assertIo(
            self,
            """100
10
14 85 77 26 50 45 66 79 10 3""",
            "5",
            no005.solve
        )
