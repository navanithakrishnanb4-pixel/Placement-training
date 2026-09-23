public class CheckStrongNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, total = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            total = total + fact;
            temp = temp / 10;
        }
        if (total == n) {
            System.out.println(n + " is a strong number");
        } else {
            System.out.println(n + " is not a strong number");
        }
    }
}
