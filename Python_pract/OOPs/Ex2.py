# Parameterized constructor

class User:
    def __init__(self,firstName,lastName,contact):
        self.fName = firstName
        self.lName = lastName
        self.contact = contact

# create the object

u1 = User('Dharan','Kumar',7358458008)
print(u1.fName)
print(u1.lName)
print(u1.contact)

u2 = User('Manoj','sai',8395463344)
print(u2.fName)
print(u2.lName)
print(u2.contact)

u3 = User('Sai','kumar',908789089)
print(u3.fName)
print(u3.lName)
print(u3.contact)