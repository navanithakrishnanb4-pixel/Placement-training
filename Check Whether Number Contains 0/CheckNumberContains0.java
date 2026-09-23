public class CheckNumberContains0 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        boolean found = false;
        if (temp == 0) {
            found = true;
        }
        while (temp > 0) {
            if (temp % 10 == 0) {
                found = true;
            }
            temp = temp / 10;
        }
        if (found) {
            System.out.println(n + " contains the digit 0");
        } else {
            System.out.println(n + " does not contain the digit 0");
        }
    }
}
