public class CountOddDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int count = 0;
        while (temp > 0) {
            if ((temp % 10) % 2 != 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Count of odd digits: " + count);
    }
}
