from pets import Pet, Dog

misterPet = Pet("Mister","Dog")
misterDog = Dog("Mister",True)

a = isinstance(misterPet,Pet)
print(a) # True
a = isinstance(misterPet,Dog)
print(a) # False

isinstance(misterDog,Pet)
isinstance(misterDog,Dog)

# misterPet.chasesCats()
a = misterDog.chasesCats()
print(a)

a = misterPet.getName()
print(a)
a = misterDog.getName()
print(a)

