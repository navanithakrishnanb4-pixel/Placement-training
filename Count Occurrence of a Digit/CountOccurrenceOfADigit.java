public class CountOccurrenceOfADigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the digit to search for: ");
        int d = sc.nextInt();
        int temp = Math.abs(n);
        int count = 0;
        while (temp > 0) {
            if (temp % 10 == d) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Occurrence of digit " + d + " is: " + count);
    }
}
