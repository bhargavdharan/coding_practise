# single-level inheritance
# Multi-level
# Hirarchial
# multiple
# Hybrid

# single level inheritance --> the properties extending from single parent class to single child class is called single level inheritance.
# Multi

class Parent:
    def d1(self):
        print("Parent function")
class Child(Parent):
    def d2(self):
        print("child function")

p = Parent()
p.d1()

c = Child()
c.d1()
c.d2()