# program to do arithmetical operations

# Addition, subtraction, Multiplication, Division

# we used the format() to format the string

#storing inputs

num1 = input('Enter First Number:')
num2 = input('Enter second Number:')

# Add two numbers
sum = int(num1) + int(num2)
print ("The addition of {0} and {1} is {2}".format(num1,num2,sum))

# Sub two numbers
sub = int(num1) - int(num2)
print("The subtraction of {0} and {1} is {2}".format(num1,num2,sub))

# Mul two numbers
mul = int(num1) * int(num2)
print("The multiplication of {0} and {1} is {2}".format(num1,num2,mul))

# Div two numbers
div = int(num1) / int(num2)
print("The division of {0} and {1} is {2}".format(num1,num2,div))

# output
'''
Enter First Number:100
Enter second Number:10
The addition of 100 and 10 is 110
The subtraction of 100 and 10 is 90
The multiplication of 100 and 10 is 1000
The division of 100 and 10 is 10.0

'''