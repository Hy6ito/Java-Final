package block4;

public class task1 {
    public static void main(String[] args)
    {
        //лимит строки
        int k=10;
        System.out.println("Text processor output: "+System.lineSeparator()+
                textProcessor(k,"hello my name is Bessie and this is my essay"));
    }

    private static String textProcessor(int k, String x)
    {
        int calsimv=0, poslprob=0;
        for (int i=0;i<x.length();i++)
        {
            if (Character.isLetter(x.charAt(i))) //ищем букву
                calsimv++;
            else if (Character.isSpaceChar(x.charAt(i)))//ищем пробел
                poslprob=i;
            else return "Wrong input: ONLY letters!";

            //
            if (calsimv>k && poslprob!=0)
            {
                calsimv = i-poslprob;
                x = x.substring(0,poslprob)+System.lineSeparator()+x.substring(poslprob+1); //разделяем строку
            }
        }
        return x;
    }
}

