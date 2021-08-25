# Inheritance

'''
Superclass: The class from which our element is inheriting is known as Superclass
Subclass: The class which is inheriting characteristics is known as sub-class
'''

class Car():
    def __init__(self,nDoors,nWheels,tailLight,headLight,Engine,wheelDrive):
        self.nDoors = nDoors
        self.nWheels = nWheels
        self.tailLight = tailLight
        self.headLight = headLight
        self.Engine = Engine
        self.wheelDrive = wheelDrive
    def show(self):
        print(" No.of Doors: {0}".format(self.nDoors))
        print(" No.of wheels: {0}".format(self.nWheels))
        print(" Is there a tailLight? {0}".format(self.tailLight))
        print(" Is there a headLight? {0}".format(self.headLight))
        print(" Engine type: {0}".format(self.Engine))
        print(" Drive Type: {0}".format(self.wheelDrive))

class McLaren(Car):
    def drive(self):
        print("I am driving McLaren 720s Spyder")

# creating object for McLaren class
Car1 = McLaren("4","4","YES","YES","V8","AWD")

# Accessing attributes from McLaren
Car1.drive()
Car1.show()

