public class FindFirstDigit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        while (temp >= 10) {
            temp = temp / 10;
        }
        System.out.println("The first digit is: " + temp);
    }
}
