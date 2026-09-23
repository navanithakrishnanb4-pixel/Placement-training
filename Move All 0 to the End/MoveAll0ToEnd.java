public class MoveAll0ToEnd {
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
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                result[index] = a[i];
                index++;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            result[index] = 0;
            index++;
        }
        System.out.println("Array after moving all 0 to the end:");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
