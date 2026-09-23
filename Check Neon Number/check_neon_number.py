n = int(input("Enter a number: "))
square = n * n
total = 0
for ch in str(square):
    total += int(ch)
if total == n:
    print(n, "is a neon number")
else:
    print(n, "is not a neon number")
