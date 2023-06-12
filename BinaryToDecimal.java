import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Move to the next line after reading N

        for (int i = 0; i < N; i++) {
            String binary = scanner.nextLine();
            int decimal = convertToDecimal(binary);
            System.out.println(decimal);
        }
    }

    public static int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
