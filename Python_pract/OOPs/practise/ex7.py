# Polymorphism

'''
Generally, assume polymorphism as one task can be performed in different ways
Technically, it is the ability to represent objects of different types using a single interface.
'''

class Rectangle:
    def __init__(self,length,breadth):
        self.l = length
        self.b = breadth

    def area(self):
        a = self.l * self.b
        print("Area of the Rectangle:",a)

    def perimeter(self):
        b = 2 * (self.l * self.b)
        print("Perimeter of Rectangle:",b)

class Square():
    def __init__(self,side):
        self.side = side

    def area(self):
        a = self.side**2
        print("Area of a square:",a)

    def perimeter(self):
        b = 4*self.side
        print("Perimeter of square",b)

rec1 = Rectangle(10,20)
rec1.area()
rec1.perimeter()
sq1 = Square(10)
sq1.area()
sq1.perimeter()