package block4;

public class task5 {
    public static void main(String[] args)
    {
        System.out.println("BMI result 1: " + BMI("205 pounds", "73 inches"));  //27.0 Overweight
        System.out.println("BMI result 2: " + BMI("55 kilos", "1.65 meters")); //20.2 Normal weight
        System.out.println("BMI result 3: " + BMI("154 pounds", "2 meters"));  //17.5 Underweight
    }

    private static String BMI(String str1, String str2)
    {
        String finStr = "";
        double weight = Double.parseDouble(str1.substring(0,str1.indexOf(" "))); //разделяем строку в ковычках
        double height = Double.parseDouble(str2.substring(0,str2.indexOf(" ")));
        if (str1.endsWith("pounds"))
            weight *= 0.453592; //переводим
        if (str2.endsWith("inches"))
            height *= 0.0254; //переводим

        //считаем ИМТ
        double BMI = weight/Math.pow(height,2);
        //выводим результат
        if (BMI<18.5)
            finStr += String.format("%.1f", BMI) + " Underweight";
        else if (BMI>18.5 && BMI<25)
            finStr += String.format("%.1f",BMI) + " Normal weight";
        else if (BMI>25)
            finStr += String.format("%.1f",BMI) + " Overweight";
        return finStr;
    }
}
