// Encapsulation :
// If you take data members of a class which means those instance variables to provide security for them you prevent direct access

// How will i prevent direct access?
// By making use of private keyword

// The moment you tell private outsiders cant access
// Here what we have is prevented access
// Encapsulation means providing access that means not direct access it is indirect access or controlled access we providing

// How does one provide control access?
// By using setters and getters


// Constructor : It is a setter-type which does not have return type and its name should be same name as class name

// Default-Constructor : It activates automatically by JVM only if programmer doesn't give any constructor within a class

class Car
{
    private String name;
    private int milleage;
    private int cost;

    // public void setData(String name, int milleage, int cost) 
    public Car(String name, int milleage, int cost) 
    {
        // Shadowing Problem
        // Name clash occurs due to same names for both local and instance variables
        // (instanceV)name = (localV)name;
        // this is the one & only keyword in java that only associated with instance variables
        this.name = name;
        this.milleage = milleage;
        this.cost = cost;
    }
    
    public String getName() 
    {
        return name;
    }

    public int getMilleage()
    {
        return milleage;
    }

    public int getCost()
    {
        return cost;
    }
}

class Demo
{
    public static void main(String[] args) {
        // Why we using Car() ? bcoz we calling here constructor
        Car c = new Car("BMW",60,250000);
        // c.setData("BMW", 60, 250000);
        System.out.println(c.getName());
        System.out.println(c.getMilleage());
        System.out.println(c.getCost());
    }
}


// Diff b/w Constructor & Regular-Method
//       Constructor              ||        Method
//  when does constructor         || First object should be ready
//  get called ?                  || Car c = new Car();
//  During Object Creation        || c.getName();
//  Car c = new Car()             ||
//  1. Constructor will be        || 1. Method will be called after
// called during object creation  ||  object creation
//                                ||
//  2. It has no return type      || 2. It has return type
//  3. It should have same name   || 3. It's name may or may not be same 
//  as that of class name         ||  as that of class name
//