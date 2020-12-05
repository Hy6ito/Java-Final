package block4;

public class task7 {
    public static void main(String[] args)
    {
        System.out.println("Converted string 1: " + toStarShorthand("abbccc"));  //"ab*2c*3"
        System.out.println("Converted string 2: " + toStarShorthand("77777geff"));   //"7*5gef*2"
        System.out.println("Converted string 3: " + toStarShorthand("abc")); //"abc"
        System.out.println("Converted string 4: " + toStarShorthand(""));    //""
    }

    private static String toStarShorthand(String str)
    {
        String result = "\""; //ставим ковычку
        char predidus = '0';
        int count = 1;
        for (int i=0;i<str.length();i++)
        {
            //проверяем повторяется ли символ
            if (predidus != str.charAt(i))
            {
                if (count>1)
                    result += "*" + count;
                predidus = str.charAt(i);
                result += predidus;
                count = 1;
            }
            else
            {
                count++;
                if (i == str.length() - 1 && count > 1)
                    result += "*" + count;
            }
        }
        return result += "\"";
    }
}
