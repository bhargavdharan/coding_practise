# program to find the factorial of a number
'''
what is factorial?
 Factorial is a non-negative integer.it is the product of all positive integers less than or equal to that number asked for factorial.
 ex:  4! = 4*3*2*1
'''

# method-1 ==> Normal

num = int(input("enter a number:"))
print('--------------------------------------')
factorial = 1
if num < 0:
    print("Factorial does not exist for negative values")
elif num == 0:
    print("The factorial of 0 is 1")
else:
    for i in range(1,num+1):
        factorial = factorial * i
    print("The factorial of",num,"is",factorial)

print('--------------------------------------')
print('---factorial using recursion------')
n = int(input("Enter a number:"))
def fact(n):
    return 1 if (n==1 or n==0) else n * fact(n-1)

print("Factorial of",num,"is",fact(n))

print('--------------------------------------')
print('-----Factorial using built-in fns---------')

import math
def fact(a):
   return(math.factorial(a))

a = int(input("enter the number:"))
f = fact(a)
print("factorial of",num,"is",f)
