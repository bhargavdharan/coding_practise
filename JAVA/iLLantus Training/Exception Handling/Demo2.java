class Demo2{
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 10;
        try {
            double res = num1 / num2;
            System.out.println("Div : " + res);
            try{
                int num = Integer.parseInt("Hello");
                System.out.println(num);
            }catch(Exception e){
                System.out.println("Error is "+e);
            }
        }catch (ArithmeticException e) {
            System.out.println("Error is : "+e);
            // System.out.println("Another Error is : " + e2);
        }

        try {
            String s1 = null; // java.lang.NullPointerException
            // String s1 = "Hello";
            System.out.println("Length of the String : " + s1.length());
        } catch (NullPointerException e) {
            System.out.println("Another Error is : " + e);
        }

        try{
            int a[] = {1,2,3,4,5};
            a[7] = 90;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Another Error is : " +e);

        }

    }
}