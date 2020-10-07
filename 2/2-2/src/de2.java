public class de2 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {9,5,2,7,-11,-40,22,14};
        System.out.println(BiGLit(arr1));
    }
    private static int BiGLit(int[] arr)
    {
        int big=arr[0]; int lit=arr[0];
        for (int nam : arr)
            if (big < nam) {
                big = nam;
            } else if (lit > nam) {
                lit = nam;
            }
        return big-lit; 
    }
}

