# program to print the fibonacci sequence
'''
Fibonacci sequence: fibonacci sequence specifies a series of numbers where the next number is found by adding up the two numbers just before it
ex: 0 1 1 2 3 5 8 13..........
    0+1=1
      1+1=2
        1+2=3
sequence: F(n) = F(n-1) + F(n-2)
f(0) = 0 and f(1) = 1
'''

# n = int(input("How many terms the wants to print fibonacci series::::>"))

# # first two terms
# n1 = 0
# n2 = 1

# # checking no of terms valid or not
# if n<=0:
#     print("Enter a positive integer, the given number is not valid")
# elif n==1:
#     print("The fibonacci sequence of the numbers up to",n)
#     print(n1)
# else:
#     print("the fibonacci sequence of the numbers is:")
#     count = 1
#     while count<n:
#         print(n1)
#         nth = n1 + n2
#         n1 = n2
#         n2 = nth
#         count +=1

n = int(input("Enter how many numbers you want in this series: "))

first = 0
second = 1

for i in range(n):
    print(first)
    temp = first
    first = second
    second = temp + second

