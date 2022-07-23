

class Showroom
{
    public void company()
    {
        System.out.println("Renault");
    }

    public void model() {
        System.out.println("Duster");
    }

    public void color() {
        System.out.println("White/Grey");
    }

    public void oilType() {
        System.out.println("Petrol");
    }

    public void price() {
        System.out.println("800,000 to 1400,000");
    }

    private void piston() {
        System.out.println("4 Piston");
    }

    private void Inventor(){
        System.out.println("Alexo Remon");
    }
}

class Solution5 {
    public static void main(String[] args) {
        Showroom s1 = new Showroom();
        s1.company();
        s1.model();
        s1.color();
        s1.price();
        s1.oilType();
    }
}