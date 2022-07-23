import java.util.*;

// class Output2

// {

//     public static void main(String args[])

//     {

//         ArrayList obj1 = new ArrayList();

//         ArrayList obj2 = new ArrayList();

//         obj1.add("A");

//         obj1.add("B");

//         obj2.add("A");

//         obj2.add(1, "B");

//         System.out.println(obj1.equals(obj2));

//     }

// }

// import java.util.*;

class vector

{

    public static void main(String args[])

    {

        Vector obj = new Vector();

        obj.addElement(3);
        obj.addElement(2);
        obj.addElement(5);
        obj.addElement(6);

        System.out.println(obj.elementAt(1));

    }

}