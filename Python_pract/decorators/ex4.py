def d1(func):
    def d2(username):
        password = input('Enter a password: ')
        if password == 'admin' and username == 'admin':
            func(username)
        else:
            print('Access Denied')

    return d2

@d1
def d3(username):
    print('Access granted')

d3('admin')