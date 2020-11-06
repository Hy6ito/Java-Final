public class de10 {
    private static boolean Triangle(int a, int b, int c)
    {
        if (((a * a) + (b * b) != (c * c)) &&
                ((a * a) + (c * c) != (b * b)) &&
                ((b * b) + (c * c) != (a * a))) {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(Triangle(8, 15, 17)); //true
        System.out.println(Triangle(6, 7, 8)); //false
        System.out.println(Triangle(5, 12, 13)); //true
    }
}
