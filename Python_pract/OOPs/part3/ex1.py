#Method overriding

class parent:
    def d1(self):
        print('d1 function parent')
class Child(parent):
    def d1(self):
        print('d2 function child')

c = Child()
c.d1()

p = parent()
p.d1()