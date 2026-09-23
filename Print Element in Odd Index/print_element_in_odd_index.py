n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
print("Elements in odd indices:")
for i in range(1, n, 2):
    print(a[i])
