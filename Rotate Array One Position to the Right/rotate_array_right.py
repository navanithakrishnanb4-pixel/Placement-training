n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
last = a[n - 1]
for i in range(n - 1, 0, -1):
    a[i] = a[i - 1]
a[0] = last
print("Array after rotating one position to the right:")
for i in range(n):
    print(a[i])
