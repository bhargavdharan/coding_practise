# Landa function which does not have any time assosiated with it
# To define a lamda we need a keyword called lamda
# we dont have any return statement in lamda functions
# we use lamda functions when functionality is very simple and they are not very used often
# it is used for filtering the data

# lamda without addition

def d1(a, b):
    return a + b;
x = d1(5,10)
print(x)

# landa with addition
# lamda arguments : expression

x = lambda a, b : a+b
print(x(5,10))
