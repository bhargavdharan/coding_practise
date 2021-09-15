from abc import ABCMeta, abstractmethod

from random import randint

class Account:
    @abstractmethod
    def createAccount():
        return 0

    @abstractmethod
    def authenticate():
        return 0

    @abstractmethod
    def withdraw():
        return 0

    @abstractmethod
    def deposit():
        return 0

    @abstractmethod
    def displayBalance():
        return 0

class SavingsAccount(Account):
    def __init__(self):
        self.savingAccounts = {"11111":["hemil",1]}
    def createAccount(self, name, initialDeposit):
        self.accountNumber = randint(10000, 99999)
        self.savingAccounts[self.accountNumber] = [name, initialDeposit]
        print(f"Your account is successfully created, Your account number is {self.accountNumber}")
    def authenticate(self,name,accountNumber):
        if accountNumber in self.savingAccounts.keys():
            if self.savingAccounts[accountNumber][0] == name:
                print("Authentication Successful!")
                self.accountNumber = accountNumber
            return True
        else:
            print(f"all keys>>>>>>>>>>>>" + str(self.savingAccounts.keys()))
            print(f"Entered name is {name}")
            print(f"name in database>>>>>>>>>>>" +str(self.savingAccounts[accountNumber][0]))
            print("Authentication failed")
            return False

    def withdraw(self,withdrawAmount):
        if withdrawAmount > self.savingAccounts[self.accountNumber][1]:
            print("Insufficient Balance")
        else:
            self.savingAccounts[self.accountNumber[1]] -= withdrawAmount
            print("Deposit successful")
            self.displayBalance(self.accountNumber)

    def deposit(self,depositAmount):
        self.savingAccounts[self.accountNumber][1] += depositAmount
        print("Deposit successful")
        self.displayBalance(self.accountNumber)

    def displayBalance(self, accountNumber):
        print(f"Available balance: {self.savingAccounts[accountNumber][1]}")

savingsAccount = SavingsAccount()

while True:
    print("Enter 1 to open an acc")
    print("Enter 2 to access an existing account")
    print("Enter 3 to quit")
    userChoice = int(input(""))

    if userChoice==1:
        name = input(("Enter your name: "))
        initialDeposit = int(input("Enter initialDeposit: "))
        savingsAccount.createAccount(name,initialDeposit)
    elif userChoice==2:
        name = input(("Enter your name: "))
        accountNumber = int(input("Enter accountNumber: "))
        authenticateStatus = savingsAccount.authenticate(name, accountNumber)
        if authenticateStatus is True:
            while True:
                print("Enter 1 to withdraw")
                print("Enter 2 to deposit")
                print("Enter 3 to display balance ")
                print("Enter 4 to exit ")
                userChoice = int(input(" "))
                if userChoice == 1:
                    withdrawAmount = int(input("Enter withdrawAmount: "))
                    savingsAccount.withdraw(withdrawAmount)
                elif userChoice == 2:
                    depositAmount = int(input("Enter depositAmount: "))
                    savingsAccount.deposit(accountNumber)
                elif userChoice == 3:
                    savingsAccount.displayBalance(accountNumber)
                elif userChoice == 4:
                    break
    elif userChoice==3:
        quit()
