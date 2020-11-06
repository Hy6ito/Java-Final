public class de8 {
    private static String Nullz(String str) {
        int max = 0;
        String Maximum = "";
        String[] subStr = str.split("1");
        for (String quantity : subStr) {
            if (!(quantity.length() <= max)) {
                max = quantity.length();
                Maximum = quantity;
            }
        }
        return Maximum;
    }

    public static void main(String[] args) {
        System.out.println(Nullz("00010000000"));
        System.out.println(Nullz("11111111010"));
        System.out.println(Nullz("1010101000"));
        System.out.println(Nullz("1010101001"));
    }
}
