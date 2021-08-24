# Encapsulation

# In python,

class Student:
    def __init__(self):
        self.__id = 123 # private variable
        self.__name = 'Mark' # private variable


    def display(self):
        print(self.__id)
        print(self.__name)

#object creation
s = Student()
s.display()


# Mangling
print(s._Student__id)
print(s._Student__name)