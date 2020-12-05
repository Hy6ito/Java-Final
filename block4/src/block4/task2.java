package block4;

public class task2 {
    public static void main(String[] args)
    {
        System.out.println("Result 1: " + split("()()()"));
        System.out.println("Result 2: " + split("((()))"));
        System.out.println("Result 3: " + split("((()))(())()()(()())"));
        System.out.println("Result 4: " + split("((())())(()(()()))"));
    }

    private static String split(String str)
    {
        String laststroka = "[";
        int open = 0, close = 0; //создаем счетчики
        for (int i=0;i<str.length();i++)
        {
            if (open==0)
                laststroka += "\""; //ставим ковычку
            //считаем открытые скобки
            if (str.charAt(i)=='(')
            {
                open++;
                laststroka += '(';
            }
            //считаем закрытые скобки
            else if (str.charAt(i)==')')
            {
                close++;
                laststroka += ')';
            }
            if (open==close)
            {
                laststroka += "\"";//добавляет закрывающую ковычку
                if (i+1 != str.length())//проверяем закончилась ли строка
                    laststroka += ", ";
                open = 0;
                close = 0;
            }
        }
        laststroka += "]";
        return laststroka;
    }
}
