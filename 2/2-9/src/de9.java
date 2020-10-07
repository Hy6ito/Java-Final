public class de9 {

    private static boolean Pref(String x, String y)
    {
        if (!x.startsWith(y)) {
            return false;
        } else {
            return true;
        }
    }
    private static boolean Suff(String x, String y)
    {
        int nA = x.length(), nB = y.length();
        int index;
        index = nA - nB;
        if (!x.startsWith(y, index)) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Prefix 1: "+Pref("megatron","mega"));
        System.out.println("Suffix 1: "+Suff("arachnophobia","phobia"));
        System.out.println("Prefix 2: "+Pref("optimusgang","gang"));
        System.out.println("Suffix 2: "+Suff("oraoraora","mudamuda"));
    }
}