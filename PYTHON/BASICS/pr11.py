# program to check leap year
'''
Leap year: A year is called a leap year if it contains an additional day which makes the number of the days in that year is 366.
'''

def checkLeap(year):
    # checking given year is leap year
    if (year%400 == 0) or (year%100 != 0) and (year%4 == 0):
        print("Given year is leap year")
    else:
        print("Given year is not a leap year")

# input from user

year = int(input("Enter the year: "))

# calling function

checkLeap(year)