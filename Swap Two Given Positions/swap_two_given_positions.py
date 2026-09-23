n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
pos1 = int(input("Enter first position (0-based index): "))
pos2 = int(input("Enter second position (0-based index): "))
a[pos1], a[pos2] = a[pos2], a[pos1]
print("Array after swapping the given positions:")
for i in range(n):
    print(a[i])
