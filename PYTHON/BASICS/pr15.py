# program to print multiplication of table

number = int(input("Enter the number of which the user wants to print table:::::>"))

print("The multiplication table of:",number)

for count in range(1,13):
    print(number,'X',count,"=",number * count)