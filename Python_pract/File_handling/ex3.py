f = open('hi.txt','w')

s = ' '

while s!= 'exit':
    s = input("Enter a text: ")
    f.write(s)

f.close()