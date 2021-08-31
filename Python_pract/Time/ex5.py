import time

class Clock():

    def d1(self):
        try:
            print('Start the clock')
            while True:
                localtime = time.localtime()
                r = time.strftime("%I:%M:%S :%p ",localtime)
                print(r)
                time.sleep(1);
        except KeyboardInterrupt:
            print('Stop the clock')

c = Clock()
c.d1()