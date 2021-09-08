# positioning with tkinter Grid system
from tkinter import *

root = Tk()

# creating a label widget
myLabel1 = Label(root, text="Hello, world!")
myLabel2 = Label(root, text="My Name is, Dharan!")
myLabel3 = Label(root, text="My Name is, John!")

# showing it onto the screen
myLabel1.grid(row=0, column=0)
myLabel2.grid(row=1, column=5)
myLabel3.grid(row=2, column=8)

root.mainloop()
