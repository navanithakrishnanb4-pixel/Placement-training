#include <stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int count = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0) {
            count++;
        }
    }
    printf("Count of multiples of 3 from 1 to %d is: %d\n", n, count);
    return 0;
}
