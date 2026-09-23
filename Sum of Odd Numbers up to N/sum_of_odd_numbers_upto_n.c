#include <stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int total = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) {
            total = total + i;
        }
    }
    printf("Sum of odd numbers from 1 to %d is: %d\n", n, total);
    return 0;
}
