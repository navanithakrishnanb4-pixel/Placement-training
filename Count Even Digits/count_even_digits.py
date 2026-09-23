n = int(input("Enter a number: "))
temp = abs(n)
count = 0
while temp > 0:
    if (temp % 10) % 2 == 0:
        count += 1
    temp //= 10
print("Count of even digits:", count)
