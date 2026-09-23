public class SwapTwoGivenPositions {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter first position (0-based index): ");
        int pos1 = sc.nextInt();
        System.out.print("Enter second position (0-based index): ");
        int pos2 = sc.nextInt();
        int temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
        System.out.println("Array after swapping the given positions:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
