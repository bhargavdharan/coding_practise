# ----Python constructor---------
'''
 * constructor : it is used to initialize the instance member of the class
 * constructor can be of two types:
        1.parameterized constructor
        2.Non-parameterized constructor

'''

# constructor in python

class Employee:
    def __init__(self,name,id):
        self.id = id
        self.name = name

    def display(self):
        print(" id:%d \n Name:%s " %(self.id,self.name))

emp1 = Employee("John",101)
emp2 = Employee("David",102)

# accessing display() method to display employee 1 details
emp1.display()

# accessing display() method to display employee 2 details
emp2.display()

print('-------------------NO.of objects in class---------------------------------------')

# counting no.of objects in a class

class Student:
    count = 0;
    def __init__(self):
        Student.count = Student.count + 1

s1 = Student()
s2 = Student()
s3 = Student()

print("The number of students:",Student.count)
print('-------------------Non-parameterized constructor--------------------------------------')
print('----------------------------------------------------------')

# Python Non-parameterized constructor

class Student:
    def __init__(self):
        print('This is non parameterized constructor')
    def show(self,name):
        print("Hello",name)

student = Student()
student.show("John")

print('------------------Parameterized constructor----------------------------------------')
print('----------------------------------------------------------')

# Python parameterized constructor

class Student:
    def __init__(self,name):
        print('This is parameterized constructor')
        self.name = name
    def show(self):
        print("Hello",self.name)

student = Student("John")
student.show()

student1 = Student("David")
student1.show()

print('--------------------Default constructor--------------------------------------')
print('----------------------------------------------------------')

# Default constructor

class Student:
    rollNo = 101
    name = "Badri"

    def display(self):
        print('This is default constructor')
        print(self.rollNo,self.name)

st = Student()
st.display()

print('-------------------Multiple classes in a single constructor------------------------------------')
print('----------------------------------------------------------')

# More than one constructor in single class

class Student:
    def __init__(self):
        print('This is first constructor')
    def __init__(self):
        print('This is second constructor')

st = Student()

print('------------------Built-in function in constructor----------------------------------------')
print('----------------------------------------------------------')

'''
    1.getattr(obj,name,default) : it is used to access the attribute of the object
    2.setattr(obj,name,value)   : it is used to set a particular value to specific attribute of an object
    3.delattr(obj,name)         : it is used to delete a specific attribute
    4.hasattr(obj,name)         : it returns true if the object contains some specific attribute

'''
class Student:
    def __init__(self,name,id,age):
        self.name = name
        self.id = id
        self.age = age

s1 = Student("John",101,21)
s2 = Student("David",102,22)

print('---getattr---')
# prints attribute name of the object
print(getattr(s1,'name'))
print(getattr(s2,'name'))

print('---setattr---')
# resets the attribute value
setattr(s1,"age",23)
setattr(s2,"age",24)
print(getattr(s1,'age'))
print(getattr(s2,'age'))

print('---hasattr---')
# prints true if the student contains the attribute with name id
print(hasattr(s1,'id'))

print('---delattr---')
delattr(s1,'id')
# print(s1.id) # AttributeError: 'Student' object has no attribute 'id'

print('------Built-in class attribute----------------------')
print('------------------------------------------------')

'''
    1.__dict__
    2.__doc__
    3.__name__
    4.__module__
    5.__bases__

'''

class Student:
    def __init__(self,name,id,age):
        self.name = name;
        self.id = id;
        self.age = age
    def display(self):
        print(" Name: %s, id: %d, age: %d" %(self.name,self.id))

s1 = Student("John",101,21)
s2 = Student("David",102,22)

print(s1.__doc__)
print(s1.__dict__)
print(s1.__module__)

print(s2.__doc__)
print(s2.__dict__)
print(s2.__module__)


