import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reversed) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It is not a palindrome number.");
        }
        scanner.close();
    }
}
