# program to swap two numbers

# inputs

x = input('Enter value of x:')
y = input('Enter value of y:')

print('--------------------------------------')
print("The value of x before swapping:{}".format(x))
print("The value of y before swapping:{}".format(y))
print('--------------------------------------')

# create a temp var and swap values

temp = x
x = y
y = temp

print('--------------------------------------')
print("the value of x after swapping:{}".format(x))
print("the value of y after swapping:{}".format(y))