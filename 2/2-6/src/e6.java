import java.util.Scanner;

public class e6 {
    public static void main(String[] args)
    {
        System.out.println(fibonachi(7));
    }
    private static int fibonachi(int num)
    {
        if (num <= 2) return num ;
        else return fibonachi(num - 1) + fibonachi(num - 2);
    }
}
