# lambda functions are typically used while invoking those functions which take arguments
# Ex: filter(), map(), reduce etc..........

# filter:
# The filter is useful for taking a collection of data
# and removing the information

# number = lambda x: True if x%2 == 0 else False
# even = number(4)
# print(even)
# odd = number(3)
# print(odd)

lst = [0,1,2,3,4,5,6,7,8,9,0,1,2,4]
#filter() --> lambda and sequence

result = filter(lambda x: x%2==0, lst)
print(result)

result = list(filter(lambda x: x%2==0, lst))
print(result)