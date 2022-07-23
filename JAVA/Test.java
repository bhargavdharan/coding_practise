class Test {
    int quote(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        Test t = new Test();
        int res = t.quote(20, 30);
        System.out.println(res);
    }
}
