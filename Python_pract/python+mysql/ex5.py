import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database="myDatabase"
)

mycursor = mydb.cursor()

print("<--Python MySQL Update table-->")

print("---Update Table---")

sql = "UPDATE customers SET address = 'canyon 123' WHERE address = 'Valley 345' "

mycursor.execute(sql)

sql = "SELECT * FROM customers"

mycursor.execute(sql)

myResult = mycursor.fetchall()

print(myResult)

print("====================")

print("You can limit the number of records by using 'LIMIT' statement ")
print()
mycursor.execute("SELECT * FROM customers LIMIT 5")

myResult = mycursor.fetchall()

for x in myResult:
    print(x)
print()

print("We can also select from Another Position")
print()

mycursor.execute("SELECT * FROM customers LIMIT 5 OFFSET 2")

myResult = mycursor.fetchall()

print(myResult)




