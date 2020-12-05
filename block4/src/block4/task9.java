package block4;

public class task9 {
    public static void main(String[] args)
    {
        System.out.println("Result 3: " + trouble(666789, 12345667));  //true
        System.out.println("Result 4: " + trouble(33789, 12345337));   //false
        System.out.println("Result 1: " + trouble(451999277, 41177722899L));    //true
        System.out.println("Result 2: " + trouble(1222345, 12345));    //false
    }

    private static boolean trouble(long a, long b)
    {
        //переводим в строку
        String str1 = Long.toString(a), str2 = Long.toString(b);
        for (int i=0;i<str1.length()-2;i++)
        {
            //проверяем если 3 подряд
            if (str1.charAt(i) == str1.charAt(i+1) && str1.charAt(i) == str1.charAt(i+2))
            {
                for (int j=0;j<str2.length()-1;j++)
                    //проверяем если два подряд
                    if (str2.charAt(j) == str2.charAt(j+1) && str2.charAt(j) == str1.charAt(i))
                        return true;
            }
        }
        return false;
    }
}
