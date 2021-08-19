# has a relationship   ==> we are passing a data member in a parent class and passing in a child class

class User:
    def __init__(self,firstName,lastName):
        self.fName = firstName
        self.lName = lastName
        self.userRole = []  # has a relationship

    def addUserRole(self,userRole):
        self.userRole.append(userRole)

class userRole:
    def __init__(self,job,location):
      self.job = job
      self.location = location

u = User('Dharan','Kumar')

print (u.fName)
print (u.lName)

ut = userRole('IT','Banglore')

u.addUserRole((ut))

for i in u.userRole:
    print(i.job)
    print(i.location)

print (ut.job)
print (ut.location)