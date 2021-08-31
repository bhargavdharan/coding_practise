import datetime

d = datetime.date(2021, 8, 31)

t = datetime.time(12,45)
dt = datetime.datetime.combine(d,t)
print(dt)