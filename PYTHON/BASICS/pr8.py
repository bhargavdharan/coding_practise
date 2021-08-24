# program to display calender

import calendar

#Enter the month and year

yy = int(input("Enter Year: "))
mm = int(input("Enter Month:"))

# display calendar

print(calendar.month(yy,mm))