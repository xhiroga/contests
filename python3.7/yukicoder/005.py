# coding: UTF-8

def main():
    num = int (input())
    if (num % 15 == 0):
        print("FizzBuzz")
    elif (num % 3 == 0):
            print ("Buzz")
    elif (num % 5 == 0):
        print ("Fizz")

if __name__ == "__main__":
    main()

"""
平方版

# 1. どこまでを対象に取るかをチェック
for i in (1,L):
    Wa[i] = W[i] + W[i+1]
    if Wa[i] > L:
        break

# 2. 小さい順に箱を詰めていく
for j in (1,i)
    x = W[i]
    y = W[i]

# 3. 辺が最大値を超えたらOK
"""
