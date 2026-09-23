#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int reverse = 0;
    while (temp > 0) {
        reverse = reverse * 10 + temp % 10;
        temp = temp / 10;
    }
    if (n < 0) {
        reverse = -reverse;
    }
    printf("Reversed number: %d\n", reverse);
    return 0;
}
