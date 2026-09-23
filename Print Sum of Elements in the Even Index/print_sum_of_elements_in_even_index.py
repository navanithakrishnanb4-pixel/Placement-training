n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
total = 0
for i in range(0, n, 2):
    total += a[i]
print("Sum of elements in even index:", total)
