public class deal9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 9};
        System.out.print(sumOfCubes(arr));
    }
    private static int sumOfCubes(int[] arr) {
        int res = 0;
        for (int cube : arr)
            res = (int) (res + Math.pow(cube, 3));
        return res;
    }
}