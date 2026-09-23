n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
if n % 2 != 0:
    print("Middle element:", a[n // 2])
else:
    print("Middle elements:", a[n // 2 - 1], "and", a[n // 2])
