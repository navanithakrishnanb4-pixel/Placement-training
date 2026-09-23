n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
print("First element:", a[0])
print("Last element:", a[n - 1])
