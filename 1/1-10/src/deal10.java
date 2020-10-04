public class deal10 {
    public static void main(String[] args)
{
    System.out.println(ABCDMATH(5,2,1));
}
    private static boolean ABCDMATH(int x, int y, int z)
    {
        for (int i=0;i<y;i++)
            ++x;
        if ((x%z)==0)
            return true;
        else
            return false;
    }
}
