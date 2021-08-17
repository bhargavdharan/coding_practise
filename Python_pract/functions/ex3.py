def d1():
    x = 10
    print("d1 scope",x)
    def d2():
        y = 20
        print("d1 scope:",x)
        print("d1 scope:",y)
    return d2

z = d1()
d2()