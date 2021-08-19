# Using Static Method Passing v in objects

class User:



    @staticmethod
    def d1(firstName,lastName):
        fName = firstName
        lName = lastName
        print("your Firstname is:", fName)
        print("Your lastname is:",lName)


User.d1('Dharan','Kumar')
