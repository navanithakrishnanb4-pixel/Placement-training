n = int(input("Enter a number: "))
a = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        a += i
print("Sum of even numbers from 1 to", n, "is:", a)