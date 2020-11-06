public class de9 {
    private static int First(int n)
    {
        if (!Second(n)) {
            for (int i = n; ; i++) {
                if (Second(i)) return i;
            }
        } else {
            return n;
        }
    }
    private static boolean Second(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(First(5));
        System.out.println(First(26));
        System.out.println(First(102));
    }
}
