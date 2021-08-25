# Encapsulation

'''
Encapsulation is the packing of data and functions that work on that data within a single object.By doing so,you can hide the internal state of the object from the outside.This is known as INFORMATION HIDING
ex: class - it bundles data and methods in a single unit
'''

class Counter:
    def __init__(self):
        self.current = 0

    def increment(self):
        self.current += 1

    def decrement(self):
        self.current += -1

    def value(self):
        return self.current

    def reset(self):
        self.current = 0

c = Counter()
c.current = 1110
c.increment()
c.increment()
c.increment()
c.increment()
print("Counter value after increment",c.value())
c.decrement()
print("Counter value after increment",c.value())
c.reset()
print("After reset counter:",c.value())

