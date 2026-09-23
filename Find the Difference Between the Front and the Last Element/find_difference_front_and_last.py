n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
diff = a[0] - a[n - 1]
print("Difference between front and last element:", diff)
