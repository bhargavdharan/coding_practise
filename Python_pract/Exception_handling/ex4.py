class EmployeeSalary(Exception):
    def __init__(self,para):
        self.para = para

def checkSalary(eSalary):
    if(eSalary > 50000):
        print("Employee salary is  50k")
    else:
        raise EmployeeSalary("Employee salary is low")

checkSalary(80000)
print("Employee verified!")