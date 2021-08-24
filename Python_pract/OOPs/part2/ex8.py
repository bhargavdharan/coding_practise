#Hybrid inheritance:

# combination of multilevel and hierarchial

class GrandParent:
    def d1(self):
        print('Grand parent function')
class Parent(GrandParent):
    def d2(self):
        print('parent function')
class Child(Parent, GrandParent):
    def d3(self):
        print('child function')

c = Child()
c.d1()

p = Parent()
p.d2()