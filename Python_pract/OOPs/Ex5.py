# Create Setters and Betters

class User:

    def setFirstName(self,n):
        self.fName = n
    def getFirstName(self):
        return self.fName

    def setLastName(self,n):
        self.lName = n
    def getLastName(self):
        return self.lName

u1 = User()

u1.setFirstName('Dharan')
u1.setLastName('Kumar')

print(u1.getFirstName())
print(u1.getLastName())