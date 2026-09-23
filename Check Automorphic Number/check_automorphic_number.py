n = int(input("Enter a number: "))
square = n * n
if str(square).endswith(str(n)):
    print(n, "is an automorphic number")
else:
    print(n, "is not an automorphic number")
