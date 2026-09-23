n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
print("Elements greater than the previous element:")
for i in range(1, n):
    if a[i] > a[i - 1]:
        print(a[i])
