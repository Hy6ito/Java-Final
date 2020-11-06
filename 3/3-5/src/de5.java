import java.util.regex.*;
public class de5 {
    private static boolean invalidcode(String str)
    {
        Pattern pattern;
        pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");
        Matcher matcher = pattern.matcher(str);
        if ('#' != str.charAt(0))
        {
            return false;
        }
        else if (str.length() != 7)
        {
            return false;
        }
        else return matcher.matches();
    }
    public static void main(String[] args)
    {
        System.out.println(invalidcode("#EAECEE")); //true
        System.out.println(invalidcode("#CD5C58C")); //false
        System.out.println(invalidcode("#eaecee")); //true
        System.out.println(invalidcode("#CD5C5Z")); //false
     }
}

