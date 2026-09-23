public class CountNumberOfDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int count = 0;
        if (temp == 0) {
            count = 1;
        }
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
