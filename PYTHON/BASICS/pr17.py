# prgm to check armstrong number
'''
Armstrong number:
        A number is called armstrong number if it is equal to the sum of the nth power of its own digits.

        ex: 153 = 1*1*1 + 5*5*5 + 3*3*3
        64 ==> n = 2 ==> 6*6 + 4*4

        The Armstrong number is also known as narcissitic number

'''



# ===================================================================================

num = int(input("Enter a number: "))

sum = 0

temp = num
# print(temp)

n = len(str(num))


while temp > 0:
    digit = temp%10

    sum += digit**n

    temp //= 10 # truncated division

# print(temp)

if num == sum:
    print(f"{num} is an armstrong number")
else:
    print(f"{num} is not an armstrong number")