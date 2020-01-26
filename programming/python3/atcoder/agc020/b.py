# 補足:WA
def main():
    K = int(input())
    A = list(map(int, input().split()))

    A.reverse()
    max = 2
    min = 2

    for i in range(1, K):
        limit = max+A[i-1]-1
        if limit < A[i]:
            print(-1)
            return
        j = 1
        while(True):
            if A[i-1] <= A[i]*j:
                min = A[i]*j
                break
            else:
                j+=1
        max = limit - limit % A[i]
    max = int(A[K-1]*(max/A[K-1]+1)-1)
    print(str(min) + " " + str(max))

if __name__ == "__main__":
    main()
