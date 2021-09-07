# A RegEx, or Regular Expression , is a sequence of characters that forms a search pattern

# RegEx can be used to check if a string contains the specified search pattern

# In python, has a built-in package called "re",which can be used to work with regular expressions.

import re

txt = "The rain in Spain"


x = re.search("^The.*Spain$",txt)

print(x)

txt = "Vizag is port city"
x = re.search("^Vizag.*city$",txt)

print(x)

'''
RegEx Functions
1.findall  ---- Returns a list containing all matches
2.search   ---- Returns a Match object if there is a match anywhere in the String
3.split    ---- Returns a list where the string has been split at each function
4.sub      ---- Replaces one or many matches with a string
'''
