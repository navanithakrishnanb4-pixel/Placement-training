public class SwapFirstAndLastElement {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int temp = a[0];
        a[0] = a[n - 1];
        a[n - 1] = temp;
        System.out.println("Array after swapping first and last element:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
