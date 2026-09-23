n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
x = int(input("Enter the number to search: "))
index = -1
for i in range(n - 1, -1, -1):
    if a[i] == x:
        index = i
        break
print("Last occurrence index:", index)
