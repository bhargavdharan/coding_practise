class Student:
    def __init__(self):
        self.__d1() #private method

    def d2(self):
        print('d2 function')

    def __d1(self): #public M
        print('d1 function')

s = Student()
s.d2()