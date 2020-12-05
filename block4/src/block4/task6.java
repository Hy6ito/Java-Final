package block4;

public class task6 {
    public static void main(String[] args)
    {
        System.out.println("Multiplicative persistence 1: " + bugger(39)); //3
        System.out.println("Multiplicative persistence 2: " + bugger(999));    //4
        System.out.println("Multiplicative persistence 3: " + bugger(4));  //0
    }

    private static int bugger(int num)
    {
        int multiPly = 0, tekush = 1, y;
        while (num>9)
        {
            while (num>0)
            {
                y = num % 10;
                num = num / 10;
                tekush = tekush * y;
            }
            num = tekush;
            tekush = 1;
            multiPly++;
        }
        return multiPly;
    }
}
