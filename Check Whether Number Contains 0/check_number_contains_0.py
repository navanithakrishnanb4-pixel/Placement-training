n = int(input("Enter a number: "))
temp = abs(n)
found = False
if temp == 0:
    found = True
while temp > 0:
    if temp % 10 == 0:
        found = True
    temp //= 10
if found:
    print(n, "contains the digit 0")
else:
    print(n, "does not contain the digit 0")
