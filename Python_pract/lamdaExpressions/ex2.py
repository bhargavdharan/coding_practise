# lambda args: value to return if condition else value to return

x = lambda a,b : a if a>b else b 
r = x(5,10)
print(r)

def x(a, b):
    if a>b:
        return a  
    else:
        return b  
r = x(5, 10)
print(r)