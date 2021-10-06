class Problem1 {
    public static int utopianTree(int n)
    {
        int t = 1;
        for(int i=1;i<=5;i++)
        {
            if (i % 2 == 0) {
                t = t + 1;
            } else {
                t = t * 2;
            }
        }
        return t;
    }
}
