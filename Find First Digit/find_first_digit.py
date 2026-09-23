n = int(input("Enter a number: "))
temp = abs(n)
while temp >= 10:
    temp //= 10
print("The first digit is:", temp)
