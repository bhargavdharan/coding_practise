import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database="myDatabase"
)

mycursor = mydb.cursor()

print("<--Python MYSQL Order By-->")

print("|||sort the result|||")

sql = "SELECT * FROM customers ORDER BY name"

mycursor.execute(sql)

myResult = mycursor.fetchall()

for x in myResult:
    print(x)

print()

print("|||ORDER by DESC|||")

print()
sql = "SELECT * FROM customers ORDER BY name DESC"

mycursor.execute(sql)

myResult = mycursor.fetchall()

for x in myResult:
    print(x)

