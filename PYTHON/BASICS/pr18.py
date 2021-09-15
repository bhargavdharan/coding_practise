# lower = int(input("Enter lower range: "))
# upper = int(input("Enter upper range: "))

# for i in range(lower,upper+1):
#     sum = 0
#     temp = i
#     while temp > 0:
#         digit = temp % 10
#         sum += digit**3
#         temp //= 10

#         if i == sum:
#             print(i)

for i in range(1001):
    num = i
    result = 0
    n = len(str(i))  # to know no.of digits in a value

    while(i != 0):
        digit = i % 10
        result = result + digit**n
        i = i//10
    if num == result:
        print(num)
