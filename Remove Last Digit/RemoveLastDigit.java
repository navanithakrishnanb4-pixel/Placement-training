public class RemoveLastDigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = n / 10;
        System.out.println("Number after removing last digit: " + result);
    }
}
