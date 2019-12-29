results = []
for P in range(int(input())):
    N, K = [int(i) for i in input().split()]
    if (N - 1) % (K + 1) != 0:
        results.append("Win")
    else:
        results.append("Lose")

for result in results:
    print(result)
