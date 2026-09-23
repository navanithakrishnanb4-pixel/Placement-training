n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
x = int(input("Enter the number to compare: "))
count = 0
for i in range(n):
    if a[i] > x:
        count += 1
print("Count of elements greater than", x, "is:", count)
