public class de1 {
    public static void main(String[] args) {
        for (int i : new int[]{equation(1, -3, 2), equation(1, -2, 1), equation(1, 0, 1)}) {
            System.out.println(i);
        }
    }

    private static int equation(int a, int b, int c) {
        double result;
        result = Math.sqrt(b * b - (4 * a * c));
        if (result > 0) return 2;
        else if (result != 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
