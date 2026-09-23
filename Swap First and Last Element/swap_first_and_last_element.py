n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
a[0], a[n - 1] = a[n - 1], a[0]
print("Array after swapping first and last element:")
for i in range(n):
    print(a[i])
