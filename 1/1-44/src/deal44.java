public class deal44 {
    public static void main(String[] args) {
        profitableGam(0.9,2, 1);
    }
    public static void profitableGam(double prob, double prize, double pay)
    {
        if (prob * prize > pay)
        System.out.println("true");
                else
        System.out.println("false");
                }
    }

