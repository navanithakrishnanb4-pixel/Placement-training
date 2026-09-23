public class FindSmallestDigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int smallest = 9;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            temp = temp / 10;
        }
        System.out.println("Smallest digit: " + smallest);
    }
}
