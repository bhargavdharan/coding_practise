# program to check number is positive, negative or zero

# function to check number

def NumberCheck(a):
    # positive
    if a > 0:
        print("number given by you is positive")
    elif a < 0:
        print("number given by you is negative")
    else:
        print("number given by you is zero")

# input from user

a = float(input("Enter a number:"))

# print result

NumberCheck(a)