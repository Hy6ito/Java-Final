public class de8 {
    private static boolean Nach(String x, String y)
    {
        char xnach = x.charAt(0);
        char xcon = x.charAt(x.length()-1);
        char ynach = y.charAt(0);
        char ycon = y.charAt(y.length()-1);
        if (xnach==ycon && xcon==ynach)
            return true;
        else return false;
    }
    public static void main(String[] args)
    {
        System.out.println(Nach("sarah","harats"));
        System.out.println(Nach("Obama","Aspitin"));
    }
}
