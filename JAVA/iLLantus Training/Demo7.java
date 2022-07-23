// 5.Hybrid Inheritance - It is a mix of two or more of the types of Inheritance. 
// Since java doesn't support multiple inheritance with classes

// Note: Hybrid Inheritance is also not possible with classes , we achieve hybrid inheritance only through interfaces

// Java IS-A type of Relationship
// IS-A is a way of saying: this object is a type of that object.Let us see how the extends keyword is used to achieve inheritance

class SolarSystem {
    
}

class Earth extends SolarSystem {
    
}

class Mars extends SolarSystem {

}

class Moon extends Earth {
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof Mars);
    }
}