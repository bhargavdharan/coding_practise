class pt3{
    public static void main(String[] args) {
        int n = 5;
        // int ch = 65;
        char ch = 'A';
        for(int i = 1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                // System.out.print((char)ch + " ");
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}