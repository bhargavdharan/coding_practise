## Index Error

# l = [1,2,3,4,5]
# print("Statement 01")
# print(l[6])
# print("Statement 02")

try:
    l = [1,2,3,4,5]
    print("Statement 01")
    print(l[6])
    print("Statement 02")
except IndexError:
    print("Expected statement is blocked")
print("End of the code")