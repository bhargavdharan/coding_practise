#multi-level inheritance

## =>

class GrandParent:
    def d1(self):
        print("Grand parent function")

class Parent(GrandParent):
    def d2(self):
        print("parent function")

class child(Parent):
    def d3(self):
        print("child function")

c = child()
c.d1();
c.d2();
c.d3();