# Python Dates

# A date in python is not a data type of its own, but we can import module named datetime to work with dates as date objects.

# the date contains year, month, day, hour, minute, second, and microsecond.
# the "datetime" module has many methods to return information about the date object.

import datetime

# display the current date and time
x = datetime.datetime.now()
print(x)

# return the year,month,day
print("current year ===> ",x.year)
print("current month ===>",x.month)
print("current date ===>",x.day)

# returns name of the weekday
print("Name of the weekday ===> ",x.strftime("%A"))

# creating Date objects
# to create a date, we can use the datetime() class of the datetime module.
# the datetime() class requires three parameters to create a date: year,month,day.
x = datetime.datetime(2020,5,17)
print("Created date in dateobject() class ===> ",x)
x = datetime.datetime(2021,5,17)
print("Created date in dateobject() class ===> ",x)

# strftime() Method
# the datetime object has a method for formatting date objects into readable strings.
# the method is called strftime(),and takes one parameter,format,to specify the format of the returned string:
x = datetime.datetime(2021,9,10)
print("Changing created date into readable string by using strftime() method ===>",x.strftime("%B"))

