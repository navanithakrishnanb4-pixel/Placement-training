public class ProductOfDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int product = 1;
        while (temp > 0) {
            product = product * (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Product of digits: " + product);
    }
}
