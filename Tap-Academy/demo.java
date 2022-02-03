class Demo{
    public static void main(String[] args) {
        int n = 841;
        int x = 1;
        for (int i = 0; i < 50; i++) {
            int nx = (x + n / x) / 2;
            x = nx;
        }
    }
}