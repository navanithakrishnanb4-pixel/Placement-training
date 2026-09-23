public class CheckNeonNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int temp = square, total = 0;
        while (temp > 0) {
            int digit = temp % 10;
            total = total + digit;
            temp = temp / 10;
        }
        if (total == n) {
            System.out.println(n + " is a neon number");
        } else {
            System.out.println(n + " is not a neon number");
        }
    }
}
