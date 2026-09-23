public class MoveNegativesToBeginning {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                result[index] = a[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                result[index] = a[i];
                index++;
            }
        }
        System.out.println("Array after moving all negative numbers to the beginning:");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
