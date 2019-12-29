# coding: UTF-8

# もしかして、常にXかYの差の絶対値の大きい方と一致するのでは?
# と思ったが、完全に直線上にいるときは１歩多くかかる


def main():
    goal = [int(goal) for goal in input().split()]
    porn = [int(porn) for porn in input().split()]
    cnt = 0
    if goal[0] > goal[1]:
        cnt = goal[0]
    elif goal[1] > goal[0]:
        cnt = goal[1]
    elif goal[0] == goal[1]:
        cnt = goal[0]
        if porn[0] == porn[1] & porn[0] < goal[0]:
            cnt += 1
        elif porn[0] == porn[1] & porn[0] == goal[0]:
            cnt = -1
    print(cnt)


if __name__ == "__main__":
    main()
