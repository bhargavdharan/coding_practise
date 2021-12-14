class pt5{
    public static void main(String[] args) {
        int n = 5;
        // int ch = 65;
        for(int i = 1; i<=n;i++)
        {
        char ch = 'A';
            for(int j=1;j<=i;j++)
            {
                // System.out.print((char)ch + " ");
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}