# Instance Methods

class User:
     def __init__(self,firstName,lastName,contact):
         self.fName = firstName
         self.lName = lastName
         self.contact = contact

     def d1(self):
         print(self.fName,self.lName,self.contact)

u1 = User('Sai','Kumar',9087687890)
u1.d1()