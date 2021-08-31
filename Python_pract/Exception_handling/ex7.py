def d1():
    total = 0
    while True:
        try:
            i = input('Enter any number:')
            k = int(i)
        except ValueError:
            print('Enter numbers only')
        else:
            total += k
            print('The current total is: ', total)

d1()