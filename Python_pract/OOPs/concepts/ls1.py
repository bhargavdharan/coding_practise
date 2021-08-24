# An object-oriented programming is used to design the programs using classes and objects.

'''
Major principles of object-oriented programming
1.class
2.object
3.Method
4.inheritance
5.polymorphism
6.Data abstraction
7.Encapsulation
 
 ::Class::
        The Class can be defined as a collection of objects.it is a logical entity that has some specific attributes and methods.
 ::Object::
        THe Object is an entity that has a state and behavior

 ===> Everything in python is an object, and almost everything has attributes and methods.
 ===> All functions have a built-in attribute __doc__
  ::Method::
        The method is a function that is associated with an object.in python, a method is not unique to class instances.Any object type can have methods.

'''

# demo : class + objects + methods
class Car:
    def __init__(self,modelName,year):
        self.model = modelName
        self.year = year
    def display(self):
        print(self.model, self.year)

c1 = Car("Toyota",2016)
c1.display()

# Creating classes in python

class Employee:
    id = 100
    name = 'Rahul'
    def display(self):
        print(" id:%d\n Name:%s" %(self.id,self.name))
# Creating instance of class
'''
    A class can be instantiated by calling the class using the class name
'''
emp = Employee()
# emp.display()

# deleting the property of object
# del emp.id  # it gives attribute error
emp.display()