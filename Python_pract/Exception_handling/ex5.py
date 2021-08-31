class Hello:
    try:
        s = (1,2,3,4,5,6,7,8,9)
        print(s)
        t = (1,2,3,4,5,6,7,8,9,10)
        print(t)
    finally:
        print("Finally block terminated")
print("End of the code")