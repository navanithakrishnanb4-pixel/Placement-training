public class SumOfEvenDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int total = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                total = total + digit;
            }
            temp = temp / 10;
        }
        System.out.println("Sum of even digits: " + total);
    }
}
