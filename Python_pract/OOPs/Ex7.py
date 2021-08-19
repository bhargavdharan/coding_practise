# Using Static Method

class User:

    firstName = 'Dharan'  #Class V, static
    lastName = 'Kumar'

    @staticmethod
    def d1():
        print('Static Function')
        print(User.firstName)
        print(User.lastName)

User.d1()
