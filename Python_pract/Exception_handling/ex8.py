try:
    f = open('xyz.txt','r')
    # f.write('hello python learners')
    s = f.read()
    print(s)
    print('try block executed')
except IOError:
    print('Error:')
finally:
    print('final block')
    f.close()