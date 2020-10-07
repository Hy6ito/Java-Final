public class de7 {
    public static void main(String[] args)
    {
        System.out.println(checkpost("14887"));
        System.out.println(checkpost("fajkfa7"));
        System.out.println(checkpost("42 21"));
        System.out.println(checkpost("39429"));
    }
    private static boolean checkpost(String pipa)
    {
        if ((pipa.length()==5) && (pipa.matches("\\d{5,9}")))
            return true;
        else return false;
    }
}





