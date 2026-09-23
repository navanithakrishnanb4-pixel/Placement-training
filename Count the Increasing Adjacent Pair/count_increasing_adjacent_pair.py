n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
count = 0
for i in range(n - 1):
    if a[i] < a[i + 1]:
        count += 1
print("Count of increasing adjacent pairs:", count)
