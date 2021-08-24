# multiple inheritance

# A class can inherit from multiple parents

class GrandParent:
    def d1(self):
        print('Grand Parent Function')

class Parent:
    def d2(self):
        print('parent function')

class Child(Parent,GrandParent):
    def d3(self):
        print('child function')

c = Child()
c.d1()