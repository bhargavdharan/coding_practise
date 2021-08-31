# f = open('welcome.txt','w')
f = open('welcome.txt','r')
# l = ['one', 'two', 'three', 'four']
# f.writelines(l) 
# print("Data inserted..!")
s = f.read()
print(s)
f.close()
