n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
x = int(input("Enter the number to search: "))
index = -1
for i in range(n):
    if a[i] == x:
        index = i
        break
print("First occurrence index:", index)
