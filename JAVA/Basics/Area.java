class AreaOfTriangle {
    public static void main(String[] args) {
        int s1 = 20;
        int s2 = 30;
        int s3 = 50;

        int p = (s1 + s2 + s3) / 2;

        System.out.println("Perimeter of a triangle: " +p);

        int area = (p * ((p - s1) * (p - s2) * (p - s3)));

        System.out.println(area);
    }
}