public class de3 {
    public static void main(String[] args)
    {
        for (int i : new int[]{6, 28, 14, 17}) //true, true, false, false
        {
            System.out.println(findperfecto(i));
        }
    }
    private static boolean findperfecto(int del)
    {
        int sum = 0;
        for (int i = 1; del > i; i++)
            if (del % i == 0)
                sum += i;
        return del == sum;
    }
}
