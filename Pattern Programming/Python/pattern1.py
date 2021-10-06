size = int(input("Enter the size:"))

for i in range(size+1):
    for j in range(i):
        print("*",end="")
    print("\r");

print()

for i in range(size+1):
    for j in range(size,i,-1):
        print("*",end="")
    print("\r");