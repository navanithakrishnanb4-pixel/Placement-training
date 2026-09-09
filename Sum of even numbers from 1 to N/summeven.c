#include <stdio.h>
int main() {
    int n ;
    printf("Enter a number: ");
    scanf("%d", &n);
    int a = 0;
    for (int i = 0; i <= n;i++) {
        a = a + i;
    }
    printf("Sum of numbers from 0 to %d is: %d\n", n, a);
    return 0;
}