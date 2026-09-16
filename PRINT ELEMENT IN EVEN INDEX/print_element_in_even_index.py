a = []
n = int(input("Enter the number of elements: "))
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
print("Elements in even indices:")
for i in range(0, n, 2):
    print(a[i])