public class SumOf1ToN {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        System.out.println("Sum of 1 to " + n + " is: " + total);
    }
}
