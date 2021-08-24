# program to convert celsius to fahrenheit

# convertions
'''
1.celsius to fahrenheit ===> T(F) = T(C) * 9/5 +32
(or)
1.celsius to fahrenheit ===> T(F) = T(C) * 1.8 +32

2.fahrenheit to celsius ===. T(C) = T(F) - 32 / 1.8
'''

# input from user

celsius = float(input("Enter temperature in celsius:"))

# cal temp in fah

fah = (celsius * 1.8) + 32
print("%0.1f degree celsius is equal to %0.1f degree fahrenheit"%(celsius,fah))