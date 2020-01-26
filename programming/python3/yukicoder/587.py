def main():
    s = input()
    s = sorted(s)
    c = ""
    for i in range(6):
        if s[0] == s[1]:
            if s[0] == s[2]:
                print("Impossible\n")
                return
            else:
                del s[:2]
        elif c == "":
            c = s.pop(0)
        else:
            print("Impossible\n")
            return
    if c == "":
        print(s[0])
    else:
        print(c)


main()
