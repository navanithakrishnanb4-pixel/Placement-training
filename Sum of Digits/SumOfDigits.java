public class SumOfDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int total = 0;
        while (temp > 0) {
            total = total + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Sum of digits: " + total);
    }
}
