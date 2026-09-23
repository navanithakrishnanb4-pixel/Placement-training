n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
found = False
for i in range(n):
    if a[i] % 2 == 0:
        print("First even number is:", a[i])
        found = True
        break
if not found:
    print("No even number found")
