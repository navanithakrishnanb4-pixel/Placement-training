public class CountElementsGreaterThanGivenNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to compare: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                count++;
            }
        }
        System.out.println("Count of elements greater than " + x + " is: " + count);
    }
}
