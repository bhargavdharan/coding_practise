# program nto generate a random number

# in python , we can generate a random integer, doubles,long etc. in various ranges by "importing" a random class.

import random
n = random.random()
n1 = random.randint(0,50)
n2 = random.randint(100,200)
print(n)
print(n1)
print(n2)
print('--------------------------')
print('--------------------------')
randList = []
for i in range(0,10):
    n3 = random.randint(10,60)
    randList.append(n3)
print(randList)
print("============================")
randomLi = random.sample(range(10,40),6)
print(randomLi)