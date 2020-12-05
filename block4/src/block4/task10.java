package block4;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args)
    {
        System.out.println("Amount of unique \"books\" 1: " + countUniqueBooks("AZYWABBCATTTA", 'A')); //4
        System.out.println("Amount of unique \"books\" 2: " + countUniqueBooks("$AA$BBCATT$C$$B$", '$'));  //3
        System.out.println("Amount of unique \"books\" 3: " + countUniqueBooks("ZZABCDEF", 'Z'));  //0
    }

    private static int countUniqueBooks(String str, char letter)
    {
        //declaring variables
        int nach = -1, con = -1, itog = 0;
        String check, book;
        for (int i=0; i<str.length(); i++)
        {
            //
            if (str.charAt(i) == letter) //ищем откр и закр символ
            {
                if (nach == -1)
                    nach = i;
                else
                    con = i;
            }
            if (nach != -1 && con != -1)
            {
                book = str.substring(nach+1, con);//запись строки между
                check = "";//объявляем строку для уникальных символов
                for (int j = 0; j < book.length(); j++)
                    if (check.indexOf(book.charAt(j)) < 0)//проверка на уникальные символы
                        check += book.charAt(j);
                itog += check.length();//считаем кол-во уникальных символов
                nach = -1;
                con = -1;
            }
        }
        return itog;
    }
}
