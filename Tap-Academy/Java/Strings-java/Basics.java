class Temp1 {
    //Instance variables
    String name;
    String breed;
    int cost;
}

class Ex1 {
    public static void main(String[] args) {
        Temp1 t1 = new Temp1();
        t1.name = "Scooby";
        t1.breed = "Pug";
        t1.cost = 24000;
        System.out.println(t1.name);
        System.out.println(t1.breed);
        System.out.println(t1.cost);
    }
}