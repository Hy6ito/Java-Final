public class de5 {
    public static void main(String[] args)
    {
        Decimal("87");
        Decimal("8.6");
    }
    private static void Decimal(String number)
    {
        try {
            int c;
            String subNum = number.substring(number.indexOf('.'));
            char[] charNum = subNum.toCharArray();
            c = charNum.length - 1;
            System.out.println(c);
        }
        catch(Exception e)
        {
            int c;
            c = 0;
            System.out.println(c);
        }
    }
}
