## ZeroDivisionerror handling

# a = 4
# b = 20
# c = 0
# print(a/b)
# print('statement 01')
# print(a/c)
# print('statement 02')

try:
    a = 4
    b = 20
    c = 0
    print(a/b)
    print('statement 01')
    print(a/c)
    print('statement 02')
except ZeroDivisionError:
    print("Expected statement Block")
print("End of the code")