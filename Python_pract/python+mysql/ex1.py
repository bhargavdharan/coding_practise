import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database = "myDatabase"
)

mycursor = mydb.cursor()

# mycursor.execute("CREATE DATABASE myDatabase")

# mycursor.execute("SHOW DATABASES")

# for x in mycursor:
#     print(x)

# mycursor.execute("CREATE TABLE customers (name VARCHAR(255),address VARCHAR(255))")

# mycursor.execute("SHOW TABLES")

# for x in mycursor:
#     print(x)

# mycursor.execute("CREATE TABLE customers2 (id INT AUTO_INCREMENT PRIMARY KEY , name VARCHAR(255),address VARCHAR(255))")

# mycursor.execute("ALTER TABLE customers ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY")

# mycursor.execute("SHOW TABLES")

# for x in mycursor:
#     print(x)

#-----Insert into table-------

# sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"

# val = ("John","Highway 21")

# mycursor.execute(sql,val)

# mydb.commit()

# print(mycursor.rowcount,"record inserted.")

# ------- Inserting Multiple rows -------
# sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"

# val = [
#     ("Peter","Lowstreet 4"),
#     ("Amy","Apple st 652"),
#     ("Hannah","Mountain 21"),
#     ("Michael","valley 345"),
#     ("sandy","Ocean blvd 2"),
#     ("Betty","Green Grass 1"),
#     ("Richard","Sky st 331"),
#     ("Susan","One way 98"),
#     ("Vicky","Yellow Garden 2")
#     ]

# mycursor.executemany(sql,val)

# mydb.commit()

# print(mycursor.rowcount,"was inserted.")

# ------Select all records from table-----

# mycursor.execute("SELECT * FROM customers")

# myResult = mycursor.fetchall()

# for x in myResult:
#     print(x)

#------Selecting Columns-----------

# mycursor.execute("SELECT name, address FROM customers")

# myResult = mycursor.fetchall()

# for x in myResult:
#     print(x)

#------fetchone() method-------

mycursor.execute("SELECT * FROM customers")

myResult = mycursor.fetchone()

print(myResult)








