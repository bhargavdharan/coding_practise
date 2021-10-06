public class main {
    static String CatAndMouse(int x, int y, int z)
    {
        int distance1 = Math.abs(x - z);
        int distance2 = Math.abs(z - y);

        if(distance1 <distance2)
        {
            return "Cat A";
        }
        else if(distance2 <distance1)
        {
            return "Cat B";
        }
        else
        {
            return "Mouse C";
        }
    }
}
