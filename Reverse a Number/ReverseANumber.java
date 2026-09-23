public class ReverseANumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (n < 0) {
            reverse = -reverse;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
