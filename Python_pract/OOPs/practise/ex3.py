# variables in OOPS in python
'''
1.Instance Variables:
    ---> Variables that are defined inside __init__ are called instance variables and these are of object level
2.Class/static variables:
    ---> Variables that are defined outside __init__ method are called class variables and these are of class level
3.Local variables:
    ---> Variables that are confined to a method are called local variables and these are of method level.
'''

class BlogOnAuthors:

    type = "freelancer"   # class/static variables

    @classmethod
    def returnType(cls):
        return cls.type
    @staticmethod
    def statMethod():
        print("I am a static method")


    def __init__(self,authorName,numArticles):
        self.authorName = authorName            # Instance variables
        self.numArticles = numArticles          # Instance variables
        print("Created New Author Object!!")    # Instance variables


    def show(self):
        print("In show method")
        print(" Author Name: {0}, \n No.of articles: {1}".format(self.authorName,self.numArticles))

    def update(self,numArticles):
        print("In update method")
        self.numArticles = numArticles

    def totalArticles(self,draft):
        total = self.numArticles + draft  # local variables
        print(f"Total articles: {total}") # local variables


# calling class method
BlogOnAuthors.returnType()
BlogOnAuthors.statMethod()

# Accessing class variables
# Author1 = BlogOnAuthors("Niharika",25)
# Author1.type

# Accessing instance variables
# Author1.numArticles

# Accessing local variables
# Author1.totalArticles(30)

