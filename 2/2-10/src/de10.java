import java.util.Scanner;
public class de10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(steps(a));
    }
    private static int steps(int a)
    {
        int n=a, r=0;
        if (n<=0) return r;
        for (int i=1;i<n+1;i++)
            if (i%2!=0)
                r+=3;
            else r-=1;
        return r;
    }
}