n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
result = []
zero_count = 0
for i in range(n):
    if a[i] == 0:
        zero_count += 1
    else:
        result.append(a[i])
for i in range(zero_count):
    result.append(0)
print("Array after moving all 0 to the end:")
for i in range(n):
    print(result[i])
