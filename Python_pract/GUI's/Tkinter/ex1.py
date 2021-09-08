from tkinter import *

'''
--In tkinter, everything is a widget. Theres a button widgets,text widgets,frame widgets,everthings a widget.
'''

root = Tk()

# creating a label widget
myLabel = Label(root, text="Hello, world!")

# showing it onto the screen
myLabel.pack()

root.mainloop()
