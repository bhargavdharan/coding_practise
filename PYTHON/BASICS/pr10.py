# program to check number is odd or even

# if you divide a number by 2 and it gives remainder of 0 then it is known as even number, otherwise an odd number

def EorO(n):
    if(n%2==0):
        print("{0} is even number".format(n))
    else:
        print("{0} is odd number".format(n))

n = int(input("enter a number:"))

EorO(n)