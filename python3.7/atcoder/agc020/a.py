def main():
    N, A, B = input().split()
    A = int(A)
    B = int(B)

    if A+1 == B:
        print("Borys")
    elif (B-A)%2 == 1:
        print("Borys")
    else:
        print("Alice")


if __name__ == "__main__":
    main()
