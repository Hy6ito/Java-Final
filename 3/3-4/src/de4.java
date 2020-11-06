import java.util.Scanner;
public class de4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String inp = scanner.nextLine();
        System.out.println(flipEndChars(inp));
    }

    public static String flipEndChars(String str) {
        if (str.length() < 2) return "Incompatible.";
        else if (str.charAt(0) == str.charAt(str.length() - 1)) return "Two's a pair.";
        else return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
}
