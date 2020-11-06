public class de7 {
    private static boolean Kaprekar(int n)
    {
        String amount = String.valueOf(n*n);
        if (amount.length() == 1) {
            return b;
        }
        String f = amount.substring(0, amount.length()/2);
        String s = amount.substring(amount.length()/2);
        return n == (Integer.parseInt(f) + Integer.parseInt(s));
    }
    public static void main(String[] args)
    {
        System.out.println(Kaprekar(45));
        System.out.println(Kaprekar(55));
        System.out.println(Kaprekar(296));
        System.out.println(Kaprekar(297));
    }
}
