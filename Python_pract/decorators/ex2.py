def d1(func):
    def d2():
        result = func()
        return result + 'Python Learners'
    return d2   

@d1
def d3():
    return 'hello'

print(d3())