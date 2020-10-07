import java.util.Arrays;

public class de4 {
    private static String arrsum(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++){
                arr[i] =arr[i] + arr[i - 1];
            }
        String arrk = Arrays.toString(arr);
        return arrk;
    }
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {1, 5, 2};
        System.out.print(arrsum(arr1));
    }
}
