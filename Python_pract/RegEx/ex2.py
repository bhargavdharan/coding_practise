'''
Metacharacters are characters with a special meaning:
1. []  ----- A set of characters          ----- "[a-m]"

2. \   ----- Signals a special sequence   ----- "\d"

3. .   ----- Any character(except newline) ---- "he..o"

4. ^   ----- Starts with                   ---- "^hello"

5. $   ----- Ends with                     ---- "world$"

6. *   ----- Zero or more occurrences      ---- "aix*"

7. +   ----- one or more occurrences       ---- "aix+"

8. {}  ----- Exactly the specified no.of   ---- "al{2}"
                occurrences

9. |   ----- Either or                     ---- "falls|stays"

10.()  ----- Capture and group
'''
import re

txt = "The rain in spain"

# Find all lower case characters alphabetically between a and z
x = re.findall("[a-z]",txt)
# Find all upper case characters alphabetically between a and z
print(x)
x = re.findall("[A-Z]",txt)
print(x)
print('==========================================================')

txt = "That will be 59 dollars"

# find all digit characters
x = re.findall("\d",txt)
print(x)
print('==========================================================')

txt = "hello world"

# Search for a sequence that starts with "he",followed by two characters, and an "o";
x = re.findall("he..o",txt)
print(x)

x = re.findall("h......o",txt)
print(x)

x = re.findall("h.........d",txt)
print(x)
print('==========================================================')

txt = "hello world"

#check if the string starts with hello

x = re.findall("^hello",txt)
if x:
    print("yes, the string starts with 'hello' ")
else:
    print("No match")

#check if the string ends with world

x = re.findall("world$",txt)
if x:
    print("yes, the string ends with 'world' ")
else:
    print("No match")
print('==========================================================')

txt = "The rain in spain falls mainly in the plain!"

# check if the string contains "ai" followed by 0 or more 'x' characters:

x = re.findall("aix*",txt)
print(x)

if x:
    print('Yes,there is at least one match!')
else:
    print("No match")
print("----------------------")

# checks if the string contains "ai" followed by 1 or more "x" characters:
x = re.findall("aix+",txt)
print(x)

if x:
    print('Yes,there is at least one match!')
else:
    print("No match")
print("----------------------")


# check if the string contains "a" followed by exactly two "l" chracters:

x = re.findall("al{2}",txt)

print(x)
if x:
    print("Yes, there is at least one match")
else:
    print("No match")
print("----------------------")


# check if the string contains either "falls" or "stays"
x = re.findall("falls|stays",txt)

print(x)
if x:
    print("Yes, there is at least one match")
else:
    print("No match")
print("----------------------")




