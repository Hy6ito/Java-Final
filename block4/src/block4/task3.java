package block4;

public class task3 {
    public static void main(String[] args)
    {
        System.out.println("Converted to camel case 2: " + toCamelCase("is_modal_open"));   //isModalOpen
        System.out.println("Converted to snake case 2: " + toSnakeCase("getColor"));    //get_color
        System.out.println("Converted to camel case 1: " + toCamelCase("hello_edabit"));    //helloEdabit
        System.out.println("Converted to snake case 1: " + toSnakeCase("helloEdabit")); //hello_edabit
    }

    private static String toCamelCase(String str)
    {
        String Str = "";
        char text;
        for (int i=0;i<str.length();i++)
        {
            text = str.charAt(i);
            //смотрим где пробел
            if (text=='_')
            {
                i++;
                text = Character.toUpperCase(str.charAt(i));
            }
            Str += text;
        }
        return Str;
    }

    private static String toSnakeCase(String str)
    {
        String Str = "";
        char letter;
        for (int i=0;i<str.length();i++)
        {
            letter = str.charAt(i);
            //смотрим где uppercase
            if ((int)letter>=65 && (int)letter<=90) {
                Str += '_';
                letter = Character.toLowerCase(letter);
            }
            Str += letter;
        }
        return Str;
    }
}
