# closures are the inner functions that are enclosed with outer functions.
# closures can access variables present in the outer function scope.
# it can be access these variables even after the outer function has completed.

def outerFunction(a,b):

    def innerFunction():
        print(a+b)
    innerFunction()

outerFunction(10,20)