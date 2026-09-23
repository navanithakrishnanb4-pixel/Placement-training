public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("The number is positive.");
        } else if (a < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
