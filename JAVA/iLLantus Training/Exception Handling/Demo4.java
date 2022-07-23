class Demo4 {
    static void test() throws RuntimeException {
        int age = 20;
        if (age < 18) {
            throw new RuntimeException("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 2;
        try{
            // double result = num1/num2;
            // System.out.println("Div : " + result);

            // throw new RuntimeException("Number is not valid");
           test();

        }
        catch (Exception e) {
            System.out.println("Error :" +e);
        }
    }
}
