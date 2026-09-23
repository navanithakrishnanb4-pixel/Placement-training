public class FindLargestDigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int largest = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > largest) {
                largest = digit;
            }
            temp = temp / 10;
        }
        System.out.println("Largest digit: " + largest);
    }
}
