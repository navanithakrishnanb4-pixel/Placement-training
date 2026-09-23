public class FindLargestOf2Numbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The largest number is: " + a);
        } else {
            System.out.println("The largest number is: " + b);
        }
    }
}
