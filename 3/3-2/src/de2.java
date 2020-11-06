import java.util.Scanner;
public class de2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inp = scanner.nextLine();
        System.out.println(findZip(inp));
    }
    private static int findZip(String str)
    {
        int firstZip = str.indexOf("zip") + 1;
        int secondZip = str.indexOf("zip", firstZip);
        return secondZip;
    }
}

