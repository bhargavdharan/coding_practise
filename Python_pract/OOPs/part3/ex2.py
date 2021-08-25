class College:
    def weekEnds(self):
        print("College is closed on Sat and Sun")

class Student:
    def weekEnds(self):
        print("College is closed on sat and sun")

class Management(College,Student):

    s = Student()
    s.weekEnds()

    c = College()
    c.weekEnds()