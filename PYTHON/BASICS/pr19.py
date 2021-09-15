'''
Perfect Numbers:
    perfect number is a positive integer that is equal to the sum of its positive divisors excluding the number itself.

    ex: 6 ==> 1,2,3(perfect divisors) ==> 1+2+3
'''

num = int(input("Enter the number : "))

result = 0

for i in range(1,num):
    if (num%i) == 0:
        result = result + i

if result == num:
    print(f"{num} is a perfect number")
else:
    print(f"{num} is not a perfect number")