public class CountIncreasingAdjacentPair {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                count++;
            }
        }
        System.out.println("Count of increasing adjacent pairs: " + count);
    }
}
