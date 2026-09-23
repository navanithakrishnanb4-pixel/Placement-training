public class CheckDivisibilityBy5And11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else if (a % 5 == 0) {
            System.out.println("The number is divisible by 5 but not by 11.");
        } else if (a % 11 == 0) {
            System.out.println("The number is divisible by 11 but not by 5.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }
    }
}
