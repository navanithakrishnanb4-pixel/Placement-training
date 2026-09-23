public class PrintMiddleElement {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        if (n % 2 != 0) {
            System.out.println("Middle element: " + a[n / 2]);
        } else {
            System.out.println("Middle elements: " + a[n / 2 - 1] + " and " + a[n / 2]);
        }
    }
}
