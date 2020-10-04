public class deal3 {
    public static void main(String[] args) {
        System.out.println(legs(5, 2, 8));
    }

    public static int legs(int ch, int co, int pe) {
        int x=2*ch; int y=4*co; int z=4*pe;
        return x+y+z;
}
}