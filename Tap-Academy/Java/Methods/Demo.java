package Java.Methods;

class calculator {
    int a = 50;
    int b = 40;
    void  add()
    {
        int c = a + b;
        System.out.println(c);
    }
  public static void main(String[] args) {
    calculator c = new calculator();
      c.add();
  }
}