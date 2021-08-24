class Parent:
    def __init__(self):
        self.id = 101
        self.name = 'Sachin'
        print('default constructor')

class Child(Parent):
    def d1(self,age):
        self.age = age
        print(age)

c = Child()
print(c.id)
print(c.name)


c.d1(21)