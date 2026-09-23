n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
total = 0
for i in range(n):
    total += a[i]
average = total / n
count = 0
for i in range(n):
    if a[i] < average:
        count += 1
print("Average is:", average)
print("Count of elements smaller than average:", count)
