import math

n = int(input())

r = int(math.pow(2, int(math.log(n, 2)) + 1) - 1)
print(r)
