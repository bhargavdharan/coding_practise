'''
Special sequences
1. \A         ------ Returns a match if the specified characters are at the beginning of the string                            ----

2. \b         ------ Returns a match where the specified characters are at the beginning or at the end of word                 ----

3. \B         ------ Returns a match where the specified characters are present, but NOT at the beginning or the end of a word ----

4. \d         ------ Returns a match where the string contains digits (0 - 9)                                                  ----

5. \D         ------ Returns a match where the string DOES NOT contain digits

6. \s         ------ Returns a match where the string contains a white space character

7. \S         ------ Returns a match where the string DOES NOT contains a white space character

8. \w         ------ Returns a match where the string contains any word characters

9. \W         ------ Returns a match where the string DOES NOT contain any word characters

10. \Z        ------ Returns a match if the specified characters are at the end of the string

'''

import re

txt = "The rain in spain"

# check if the string starts with "The":

x = re.findall("\AThe",txt)

print (x)
if x:
    print("Yes,there is a match!")
else:
    print("No match")
print('---------------------------')

# check if "ain" is present at the beginning of a WORD:

x = re.findall(r"\bain",txt)
print (x)
if x:
    print("Yes,there is a match!")
else:
    print("No match")

print()

# check if "ain" is present at the end of a WORD:
x = re.findall(r"ain\b",txt)
print (x)
if x:
    print("Yes,there is a match!")
else:
    print("No match")

print('---------------------------')

txt = "The rain in Spain"

# check if "ain" is present, but NOT at the beginning of a word:

x = re.findall(r"\Bain",txt)

print(x)
if x:
    print("Yes,there is a match!")
else:
    print("No match")

print()

# check if "ain" is present, but NOT at the end of a word:

x = re.findall(r"ain\B",txt)

print(x)
if x:
    print("Yes,there is a match!")
else:
    print("No match")
print('---------------------------')




