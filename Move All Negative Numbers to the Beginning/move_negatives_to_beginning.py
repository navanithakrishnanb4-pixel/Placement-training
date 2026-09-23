n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
result = []
for i in range(n):
    if a[i] < 0:
        result.append(a[i])
for i in range(n):
    if a[i] >= 0:
        result.append(a[i])
print("Array after moving all negative numbers to the beginning:")
for i in range(n):
    print(result[i])
