n = int(input("Enter a number: "))
count = 0
for i in range(1, n + 1):
    if i % 3 == 0:
        count += 1
print("Count of multiples of 3 from 1 to", n, "is:", count)
