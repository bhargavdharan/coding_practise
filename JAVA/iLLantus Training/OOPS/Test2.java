package OOPS;

class School {
    int roll;
    String name;
    String Address;

    School() {
        roll = 0;
        name = "";
        Address = "";
    }
 
    void setVal(int x, String y, String z) {
        roll = x;
        name = y;
        Address = z;
    }

    void display() {
        System.out.println(roll+" "+name + " " + Address);
    }
}

class Admin {
    public static void main(String[] args) {
        School st = new School();
        st.setVal(1, "Dharan", "Vizag");
        st.display();
        
    }
}