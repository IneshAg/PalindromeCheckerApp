import java.util.Scanner;
class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        int length = original.length();
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
        scanner.close();
    }
}