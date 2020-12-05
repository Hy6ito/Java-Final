package block4;

public class task4 {
    public static void main(String[] args)
    {
        System.out.println(overTime(9, 17, 30, 1.5));   //$240.00
        System.out.println(overTime(16, 18, 30, 1.8));  //$84.00
        System.out.println(overTime(13.25, 15, 30, 1.5));   //$52.50
    }

    private static String overTime(double start, double finish, double stavka, double multiplier)
    {
        String peremennaya = "$";
        double money;
        if (finish>17)
            money = (17-start) * stavka + (finish-17) * stavka * multiplier;
        else
            money = (finish-start) * stavka;
        peremennaya += String.format("%.2f",money);
        return peremennaya;
    }
}
