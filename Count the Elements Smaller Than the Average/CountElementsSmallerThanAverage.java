public class CountElementsSmallerThanAverage {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + a[i];
        }
        double average = (double) total / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < average) {
                count++;
            }
        }
        System.out.println("Average is: " + average);
        System.out.println("Count of elements smaller than average: " + count);
    }
}
