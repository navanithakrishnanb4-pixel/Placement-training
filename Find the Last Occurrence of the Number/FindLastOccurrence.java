public class FindLastOccurrence {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();
        int index = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println("Last occurrence index: " + index);
    }
}
