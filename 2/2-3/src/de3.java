public class de3 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {1,7};
        int[] arr2 = new int[] {5,6,7,8};
        int[] arr3 = new int[] {2,4,6,8,2,2};
        System.out.println(sakal(arr1));
        System.out.println(sakal(arr2));
        System.out.println(sakal(arr3));
    }
    private static String sakal(int[] arr)
    {
        String tr = "True";
        String fl = "False";
        int fal = 0;
        int ost = arr.length;
        for (int num : arr)
            fal+=num;
        if (fal%ost==0)  return tr;
            else return fl;
        }
    }
