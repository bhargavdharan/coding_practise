# program to solve quadratic equation

# ax2 + bx + c = 0

# method-1

# import cmath
# a = float(input('Enter a:'))
# b = float(input('Enter b:'))
# c = float(input('Enter c:'))

# # calculate the discriminant

# d = (b**2) - (4*a*c)

# #find two solutions

# sol1 = (-b-cmath.sqrt(d)) / (2*a)
# sol2 = (-b+cmath.sqrt(d)) / (2*a)

# print("The solutions are {0} and {1}".format(sol1,sol2))

# method-2

import math

# function for finding roots

def findRoots(a,b,c):

    disc = b*b - 4*a*c
    sqrt = math.sqrt(abs(disc))

    if disc>0:
        print("Real and different roots")
        print((-b + sqrt)/(2*a))
        print((-b - sqrt)/(2*a))

    elif disc==0:
        print("real and same roots")
        print(-b/(2*a))

    else:
        print("Complex roots")
        print(-b/(2*a),"+i",sqrt)
        print(-b/(2*a),"-i",sqrt)

a = int(input("Enter a:"))
b = int(input("Enter b:"))
c = int(input("Enter c:"))

# if a becomes 0 , then  it is incorrect quadratic equation
if a == 0:
    print("Input correct quadratic equation")
else:
    findRoots(a,b,c)



