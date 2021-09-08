import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="*******",
    database="myDatabase"
)

mycursor = mydb.cursor()

print("Database connected !..")

# mycursor.execute("CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY , name VARCHAR(255),fav INT)")
# mycursor.execute("CREATE TABLE products (id INT, name VARCHAR(255))")
print("creating tables")

# sql = "INSERT INTO users (name,fav) VALUES (%s,%s)"

# val = [
#     ("Peter",154),
#     ("Amy",154),
#     ("Hannah",155),
#     ("Michael",345),
#     ("sandy",346),
#     ("Betty",347),
#     ]

# mycursor.executemany(sql,val)

# mydb.commit()
# print("Table created!")

# print(mycursor.rowcount,"was inserted.")

print()

# sql = "INSERT INTO products (id, name) VALUES (%s, %s)"

# val = [
#     (154,"chocolate Heaven"),
#     (154,"Tasty Lemons"),
#     (155,"Vanilla Dreams"),
#     (156,"Barbie Dolls")
#     ]

# mycursor.executemany(sql,val)

# mydb.commit()
# print("Table created!")

# print(mycursor.rowcount,"was inserted.")

sql = "DESCRIBE users"

mycursor.execute(sql)

myResult = mycursor.fetchall()

print(myResult)

print("==============================")

sql = "SELECT * FROM users"

mycursor.execute(sql)

myResult = mycursor.fetchall()

print(myResult)

print("==============================")
sql = "DESCRIBE products"

mycursor.execute(sql)

myResult = mycursor.fetchall()

for x in myResult:
  print(myResult)

print("==============================")

sql = "SELECT * FROM products"

mycursor.execute(sql)

myResult = mycursor.fetchall()

for x in myResult:
   print(myResult)

print("==============================")

print("These two tables can be combined by using users 'fav' field and products 'id' field")

# sql = "SELECT \
#     users.name AS user, \
#     products.name AS favorite, \
#     FROM users \
#     INNER JOIN products ON users.fav = products.id"

# mycursor.execute(sql)

# myResult = mycursor.fetchall()

# for x in myResult:
#     print(x)


