public class deal7 {
    public static void main(String[] args)
    {
        System.out.println(SummChis(10));
    }
    private static int SummChis(int a)
    {
        int n=a;
        int res=0;
        for (int i=1;i<n+1;i++)
        {
            res=res+i;
        }
        return res;
    }
}
