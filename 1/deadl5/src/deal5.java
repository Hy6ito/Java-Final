public class deal5 {
    public static void main(String[] args) {
            zera(3, 30, 10);
        }
        private static void zera(int N, int x, int y)
        {
            int plus = x + y;
            int minus1 = x - y;
            int minus2 = y - x;
            int umn = x * y;
            int del1 = x / y;
            int del2 = y / x;
            if (N == plus)
                System.out.println("x+y");
            else if (N == minus1)
                System.out.println("x-y");
            else if (N == minus2)
                System.out.println("y-x");
            else if (N == umn)
                System.out.println("x*y");
            else if (N == del1)
                System.out.println("x/y");
            else if (N == del2)
                System.out.println("y/x");
            else
                System.out.println("none");
        }
    }