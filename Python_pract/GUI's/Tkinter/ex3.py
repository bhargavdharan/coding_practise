# Creating buttons
from tkinter import *

root = Tk()

def myClick():
    myLabel = Label(root, text="Look! I clicked a Button!")
    myLabel.pack()

myButton1 = Button(root, text="Click Me!",state=DISABLED)
myButton2 = Button(root, text="Click Me!")
myButton3 = Button(root, text="Click Me!",padx=50,pady=50)
myButton4 = Button(root, text="Click Me!",command=myClick,fg="blue",bg="yellow")


myButton1.pack()
myButton2.pack()
myButton3.pack()
myButton4.pack()

root.mainloop()









