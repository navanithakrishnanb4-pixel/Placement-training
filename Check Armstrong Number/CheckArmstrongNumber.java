public class CheckArmstrongNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, digits = 0, total = 0;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            total = total + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }
        if (total == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
