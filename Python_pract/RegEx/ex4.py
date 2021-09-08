import re

print("====findall() Function====")
print()
print("---> The finall() function returns a list containing all matches")

txt = "The rain in spain"
x = re.findall("ai",txt)
print(x)

print("---> Returns an empty list if no match was found")
x = re.findall("london",txt)
print(x)

print()
print("====searchall() Function====")
print()

txt = "The rain in london"
print("---> The search() function searches the string for a match, and returns a Match object if there is a match.")
x = re.search("\s",txt)
print()
print("The first whit-space character is located in position:",x.start())
print()
x =re.search("spain",txt)
print(x)

print()
print("====split() Function====")
print()
print("---> The split() function returns a list where the string has been split at each match")
print()
txt = "The rain in India"
x = re.split("\s",txt)
print(x)
print()
print("---> You control the number of occurence by specifying the maxsplit parameter")
x = re.split("\s",txt,2)
print(x)