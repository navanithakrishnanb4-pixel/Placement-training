n = int(input("Enter a number: "))
result = n // 10 if n >= 0 else -(abs(n) // 10)
print("Number after removing last digit:", result)
