public class PrintElementGreaterThanPrevious {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Elements greater than the previous element:");
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                System.out.println(a[i]);
            }
        }
    }
}
