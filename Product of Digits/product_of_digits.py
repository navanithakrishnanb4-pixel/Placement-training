n = int(input("Enter a number: "))
temp = abs(n)
product = 1
while temp > 0:
    product *= temp % 10
    temp //= 10
print("Product of digits:", product)
