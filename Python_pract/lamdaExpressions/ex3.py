def d1(a):
    return lambda b: b**a  

r = d1(2)
print(r(5))
