# Reference of all legal format codes
import datetime

x = datetime.datetime.now()

# 1.%a  ---- weekday,short version
print("short-form weekday ===> ",x.strftime("%a"))
# 2.%A  ---- weekday,full version
print("full-form weekday ===> ",x.strftime("%A"))

#3.%w   ---- weekday as a number 0-6
print("weekday number from [0-6] ===> ",x.strftime("%w"))

#4.%d   ---- day of month [01-31]
print("Day of the month [01-31] ===> ",x.strftime("%d"))

#5.%b   ---- month name, short-version
print("Month name in short-version ===> ",x.strftime("%b"))
#6.%B   ---- month name, full-version
print("Month name in full-version ===> ",x.strftime("%B"))

#7.%m   ---- Month as a number[01-12]
print("Month number from[01-12] ===> ",x.strftime("%m"))

#8.%y   ---- Year short-version
print("short-form year ===> ",x.strftime("%y"))
#9.%Y   ---- Year full-version
print("full-form year ===> ",x.strftime("%Y"))

#10.%H  ---- Hour 00-23
print("Hour format in [00-23] is '%H' ===> ",x.strftime("%H"))
#11.%I  ---- Hour 00-12
print("Hour format in [00-12] is '%I' ===> ",x.strftime("%I"))

#12.%p  ---- HOUR version AM/PM
print("Hour format in [AM/PM] is '%p' ===> ",x.strftime("%p"))

#13.%M  ---- Minute format in hour [00-59]
print("Minute format in HOUR [00-59] is '%M' ===> ",x.strftime("%M"))

#14.%S  ---- Second format in minute [00-59]
print("second format in MINUTE [00-59] is '%S' ===> ",x.strftime("%S"))

#15.%f  ---- microsecond format in second [000000-999999]
print("microsecond format in second[000000-999999] is '%f' ===> ",x.strftime("%f"))

#16.%z  ---- UTC offset
print("UTC offset ===> ",x.strftime("%z"))
#17.%Z  ---- Timezone
print("TIME ZONE ===> ",x.strftime("%z"))

#18.%j  ---- Day number in a year [001-366]
print("Day number in a year [000-366] ===> ",x.strftime("%j"))

#19.%U  ---- week number in a year,sunday as the first day of week [00-53]
print("Week number in a year(sunday as first) [00-53]",x.strftime("%U"))
#20.%W  ---- week number in a year,monday as the first day of week [00-53]
print("Week number in a year(monday as first) [00-53]",x.strftime("%U"))

#21.%c  ---- Local version of date and time
print("Local version date and time ===> ",x.strftime("%c"))

#22.%C  ---- century version
print("century version ===> ",x.strftime("%C"))

#23.%x  ---- Local version of date
#24.%X  ---- Local version of time
#25.%%
#26.%G
#27.%u
#28.%V



