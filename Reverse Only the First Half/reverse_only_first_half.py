n = int(input("Enter the number of elements: "))
a = []
for i in range(n):
    a.append(int(input(f"Enter element {i + 1}: ")))
half = n // 2
start = 0
end = half - 1
while start < end:
    a[start], a[end] = a[end], a[start]
    start += 1
    end -= 1
print("Array after reversing only the first half:")
for i in range(n):
    print(a[i])
