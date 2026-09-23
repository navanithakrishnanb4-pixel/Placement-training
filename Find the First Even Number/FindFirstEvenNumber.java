public class FindFirstEvenNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("First even number is: " + a[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No even number found");
        }
    }
}
