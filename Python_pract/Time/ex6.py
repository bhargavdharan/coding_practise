import datetime

t = datetime.datetime.today()
print(t)

rt = t.replace(year=2000,month=8,day=30)
print(rt)

e = datetime.datetime(year=2020,month=8,day=30)
print(e)

totaldays = e - rt
print(totaldays)
