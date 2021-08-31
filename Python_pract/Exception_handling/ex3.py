try:
    a = 4
    b = 2
    c = 0
    print(a/b)
    print("Statement 01")
    print(a/b)
    print("Statement 02")

    l = [1,2,3,4,5]
    print("Statement 03")
    print(l[6])
    print("Statement 04")

except Exception:
    print('Expected statement block')

else:
    print("else block")
print("End of the code")