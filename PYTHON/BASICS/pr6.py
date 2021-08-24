# program to convert kilometers into miles
# 1KM = 1000M
# 1KM = 0.62137MILES

# input

kilometers = float(input("How many kilometers?"))

# convertion factor

convertion = 0.62137

# calculate miles

miles = kilometers * convertion

meters = kilometers / 1000.0

print("%0.3f kilometers is equal to %0.3f miles" %(kilometers,miles))

print("%0.2f kilometers is equal to %0.2f meters" %(kilometers,meters))