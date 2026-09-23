public class FindLastDigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int lastDigit = Math.abs(n) % 10;
        System.out.println("The last digit is: " + lastDigit);
    }
}
