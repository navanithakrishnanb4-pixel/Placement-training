#include <stdio.h>
int main() {
    int n, square, temp, digit, total = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    square = n * n;
    temp = square;
    while (temp > 0) {
        digit = temp % 10;
        total = total + digit;
        temp = temp / 10;
    }
    if (total == n) {
        printf("%d is a neon number\n", n);
    } else {
        printf("%d is not a neon number\n", n);
    }
    return 0;
}
