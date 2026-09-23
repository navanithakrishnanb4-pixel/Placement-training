n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
first = a[0]
for i in range(0, n - 1):
    a[i] = a[i + 1]
a[n - 1] = first
print("Array after rotating one position to the left:")
for i in range(n):
    print(a[i])
