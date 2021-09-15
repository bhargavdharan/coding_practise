from pets import Cat, Dog

fido = Dog("Fido",True)
rover = Dog("Rover",False)

print(fido)
print(rover)

mittens = Cat("Mittens",True)
fluffy = Cat("Fluffy",False)

print(mittens)
print(fluffy)

print(f"{fido.getName()} chases cats: {fido.chasesCats()}")
print(f"{rover.getName()} chases cats: {rover.chasesCats()}")

print(f"{mittens.getName()} hates Dog: {mittens.hatesDogs()}")
print(f"{fluffy.getName()} hates Dog: {fluffy.hatesDogs()}")