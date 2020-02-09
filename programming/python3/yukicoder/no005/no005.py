# coding: UTF-8


def printz(stdin: str):
    print(stdin, end='')


def solve():
    box_width = int(input())
    block_num = int(input())
    blocks = sorted([int(s) for s in input().split(" ")])
    count = 0
    for block in blocks:
        if box_width < block:
            printz(count)
            return
        else:
            box_width -= block
            count += 1
    printz(count)


if __name__ == "__main__":
    solve()
