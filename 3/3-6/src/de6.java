public class de6 {
    private static boolean even(double[] l1, double[] l2)
    {
        int first = Special(l1);
        int second = Special(l2);
        return first == second;
    }
    private static int Special(double[] l)
    {
        double last;
        last = Double.NaN;
        int special = 0;
        for(var i = 0; i < l.length; i++)
            if(last != (last = l[i]))
                special++;
        return special;
    }
    public static void main(String[] args)
    {
        double[] arr11 = new double[] {8,5,2,2,2};
        double[] arr12 = new double[] {1,4,8};
        double[] arr21 = new double[] {9,8,7,6};
        double[] arr22 = new double[] {4,4,3,1};
        double[] arr31 = new double[] {2};
        double[] arr32 = new double[] {3,3,3,3,3};
        System.out.println(even(arr11,arr12));
        System.out.println(even(arr21,arr22));
        System.out.println(even(arr31,arr32));
    }
}
