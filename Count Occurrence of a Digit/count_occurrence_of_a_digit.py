n = int(input("Enter a number: "))
d = int(input("Enter the digit to search for: "))
temp = abs(n)
count = 0
while temp > 0:
    if temp % 10 == d:
        count += 1
    temp //= 10
print("Occurrence of digit", d, "is:", count)
