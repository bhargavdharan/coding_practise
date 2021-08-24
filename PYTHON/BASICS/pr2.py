# Program to find the area of a triangle

# Area of triangle = (s*(s-a)*(s-b)*(s-c)-1/2)

# three sides of triangle

a = float(input("Enter First Side:"))
b = float(input("Enter Second Side:"))
c = float(input("Enter Third Side:"))

# calculate the semi-perimeter

s = (a+b+c)/2

# calculate area

area = (s*(s-a)*(s-b)*(s-c)**0.5)
print('The area of the triangle is %0.2f'%area)

# output
'''
Enter First Side:20
Enter Second Side:30
Enter Third Side:40
The area of the triangle is 37733.65
'''