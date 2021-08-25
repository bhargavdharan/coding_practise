#Duck Typing
class Parent:

    def properties(self):
        print("properties of Parent")

class Child:

    def properties(self):
        print("properties of Child")

def getProperties(obj):
    obj.properties()

p = Parent()
getProperties(p)

c = Child()
getProperties(c)