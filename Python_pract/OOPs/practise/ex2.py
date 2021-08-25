class BlogOnAuthors:

    def __init__(self,authorName,articlesNo):
        self.authorName = authorName
        self.articlesNo = articlesNo
        print("Created new author object")

    def show(self):
        '''This method prints the details of the author'''
        print("In show method")
        print(" Author Name : {0},\n No.of Articles: {1}".format(self.authorName,self.articlesNo))

    def update(self,articlesNo):
        '''This method updates the number of published articles'''
        print("In update method")
        self.articlesNo = articlesNo

# creating objects/instances
author1 = BlogOnAuthors("Harika",10)
author2 = BlogOnAuthors("Joey",23)

# Accessing attributes and calling methods
author1.authorName
author1.articlesNo
author2.authorName
author2.articlesNo

# BlogOnAuthors.show(author1) or author1.show()
BlogOnAuthors.show(author1)
BlogOnAuthors.show(author2)
print('----------------------------------------')

# calling update method
print("Before updation...!")
author1.show()
author2.show()
author1.update(20)
author2.update(25)
print("After updation....!")
author1.show()
author2.show()