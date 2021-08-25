# Abstraction
from abc import ABC,abstractmethod

#Abstract class
class Parent(ABC):

    @abstractmethod
    def display(self):
        None

#Concrete class
class Child(Parent):
    def display(self):
        print('This is display method')

c = Child()
c.display()
