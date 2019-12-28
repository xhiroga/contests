rslts = []
for P in range(int(input())):
    N, K = [int(i) for i in input().split()]
    if (N-1)%(K+1) != 0:
        rslts.append("Win")
    else:
        rslts.append("Lose")

for rslt in rslts:
    print(rslt)
