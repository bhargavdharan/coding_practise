# program to check prime number

'''
1.Prime Numbers: if the natural number is greater than 1 and having no positive divisors other than 1 and the number itself
ex:3,7,11 are prime
2.Composite Numbers: if the natural numbers that are not prime numbers
'''

# function to check given number is prime or not

def primeCheck(a):
    #checking number is more than 1
    if a > 1:
        # iterating over the given number with for loop
        for j in range(2, int(a/2) + 1):
            if(a%j)==0:
                print(a,"is not a prime number")
                break
        else:
              print(a,"is a prime number")
    else:
        print(a,"is not a prime number")

a = int(input("Enter an input number:"))

primeCheck(a)


