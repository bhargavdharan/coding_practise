def d1():
    x = 10
    print("d1 scope",x)
    def d2():
        y = 20
        print("d1 scope:",x)
        print("d1 scope:",y)

d1()
d2() #nameError name 'd2' is not defined