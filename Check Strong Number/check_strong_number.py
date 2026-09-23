n = int(input("Enter a number: "))
temp = n
total = 0
while temp > 0:
    digit = temp % 10
    fact = 1
    for i in range(1, digit + 1):
        fact *= i
    total += fact
    temp //= 10
if total == n:
    print(n, "is a strong number")
else:
    print(n, "is not a strong number")
