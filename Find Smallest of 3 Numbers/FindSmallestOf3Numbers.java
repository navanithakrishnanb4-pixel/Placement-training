public class FindSmallestOf3Numbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("The smallest number is: " + a);
        } else if (b < a && b < c) {
            System.out.println("The smallest number is: " + b);
        } else {
            System.out.println("The smallest number is: " + c);
        }
    }
}
