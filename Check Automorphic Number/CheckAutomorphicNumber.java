public class CheckAutomorphicNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        String nStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        if (squareStr.endsWith(nStr)) {
            System.out.println(n + " is an automorphic number");
        } else {
            System.out.println(n + " is not an automorphic number");
        }
    }
}
