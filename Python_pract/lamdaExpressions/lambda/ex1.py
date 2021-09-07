# python lambda

# --- A lambda function is a small anonymous function.
# --- A lambda function can take any number of arguments, but can only have one expression.

# syntax:::: lambda arguments : expression

x = lambda a : a + 100
print("output ==>",x(5))

# lambda function can take any number of arguments

x = lambda a , b : a * b
print("output ==>",x(5,6))

x = lambda a, b, c : a + b + c + c
print("output ==> ",x(3,4,5))

'''
why we use lambda functions?
---> the power of lambda is better shown when you use them as an anonymous function inside another function
'''

def myFun(n):
    return lambda a : a * n

myLambdadouble = myFun(2)
myLambdatriple = myFun(3)
myLambdaquadraple = myFun(4)

print("lambda Exp in function will doubles the value size ==> ",myLambdadouble(22))
print("lambda Exp in function will triples the value size ==> ",myLambdatriple(22))
print("lambda Exp in function will quadraples the value size ==> ",myLambdaquadraple(22))




