class Student:

    #Mutator
    def setId(self,id):
        self.id = id

    #Accessor
    def getId(self):
         return self.id 


s = Student()
s.setId(123)
print(s.getId())