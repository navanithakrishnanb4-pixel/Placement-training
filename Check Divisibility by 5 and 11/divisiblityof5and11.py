a = int(input("Enter a number: "))
if a % 5 == 0 and a % 11 == 0:
    print("The number is divisible by both 5 and 11.")
elif a % 5 == 0 :
    print("The number is divisible by 5 but not by 11.")
elif a % 11 == 0:
    print("The number is divisible by 11 but not by 5.")
else:
    print("The number is not divisible by both 5 and 11.")