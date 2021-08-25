from  abc import ABC, abstractmethod

class GrandParent(ABC):

    @abstractmethod
    def d1(self):
        pass
    @abstractmethod
    def d2(self):
        pass
    @abstractmethod
    def d3(self):
        pass
    @abstractmethod
    def d4(self):
        print('d4 function invoked')

class Parent(GrandParent):
    def d1(self):
       print("d1 parent function")
 
class Child(GrandParent):
    def d1(self):
        print("d2 child function")

p = Parent()
p.d1()


c = Child()
c.d1()