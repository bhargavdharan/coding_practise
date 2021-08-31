class CustomError(Exception):

    def d1(self):
        a = 10
        if a == 1:
            raise CustomError('This is CustomError')
        else:
            print('no error')
c = CustomError()
c.d1()