#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int total = 0;
    while (temp > 0) {
        total = total + temp % 10;
        temp = temp / 10;
    }
    printf("Sum of digits: %d\n", total);
    return 0;
}
