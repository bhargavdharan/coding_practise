class pt2{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n;i++)
        {
        int count = i*(i+1)/2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count--);
                if(j<=i-1)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}