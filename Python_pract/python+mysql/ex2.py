import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database="myDatabase"
)

mycursor = mydb.cursor()

print("<----python MySQL WHERE clause---->")
print("Database connected!!!!!")

# print("||||select with a filter||||")

# sql = "SELECT * FROM customers WHERE address = 'Lowstreet 4'"

# mycursor.execute(sql)

# myResult = mycursor.fetchall()

# for x in myResult:
#     print(x)

# --------------------------------------------------

# print("|||wildcard Characters|||")

# # sql = "SELECT * FROM customers WHERE address LIKE '%way%'"
# sql = "SELECT * FROM customers WHERE address LIKE '%en%'"

# mycursor.execute(sql)

# myResult = mycursor.fetchall()

# for x in myResult:
#     print(x)

# ---------------------------------------------------

print("|||Prevent SQL injection|||")

sql = "SELECT * FROM customers WHERE address = %s "
addr = ("Yellow Garden 2",)

mycursor.execute(sql, addr)

myResult = mycursor.fetchall()

for x in myResult:
    print(x)