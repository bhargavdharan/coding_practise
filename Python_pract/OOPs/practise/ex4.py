class Pokemon():
    def __init__(self,name,type,health,abilities):
        self.name = name
        self.type = type
        self.health = health
        self.abilities = abilities

    def stat(self):
        print(" Pokemon: {0},\n Type: {1}".format(self.name,self.type,self,self.health))
        print(" health stat:{0}".format(self.health))
        print(" Abilities : {0}".format(self.abilities))

    def attack(self):
        print("Electric Attack!!...Zhoop!!!")

    def dodge(self):
        print("Pikachu Dodge!")

    def evolve(self):
        print("Evolving to Raichu!!!!")

# creating object
pk1 = Pokemon("Pikachu","Electric",120,"Quick Attack,Thunderbolt,Iron tail")
pk1.stat()
pk1.attack()

# creating another object
pk2 = Pokemon("GrayNinja","Dark and Water",239,"Protean(hidden-ability)")
pk2.stat()