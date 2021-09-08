import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database="myDatabase"
)

mycursor = mydb.cursor()

print("<---Python MySQL Delete From By--->")
print()
print("|||Delete Record|||")
print()

sql = "DELETE FROM customers WHERE address = 'Mountain 21' "

mycursor.execute(sql)

mydb.commit() # it is required to make the changes

print(mycursor.rowcount,"records(s) deleted")

print()
print("|||prevent sql injection||")
print()
sql = "DELETE FROM customers WHERE address = %s "
addr = ("Yellow Garden 2",)

mycursor.execute(sql,addr)

mydb.commit() # it is required to make the changes

print(mycursor.rowcount,"records(s) deleted")

print('-------------------------------------------')
print()

# print('-------------------------------------------')
# sql = "DROP TABLE customers2"

# mycursor.execute(sql)
# print("Table is deleted !")



