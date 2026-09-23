#include <stdio.h>
#include <math.h>
int main() {
    int n, temp, digit, digits = 0, total = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    temp = n;
    while (temp != 0) {
        temp = temp / 10;
        digits++;
    }
    temp = n;
    while (temp != 0) {
        digit = temp % 10;
        total = total + (int) pow(digit, digits);
        temp = temp / 10;
    }
    if (total == n) {
        printf("%d is an Armstrong number\n", n);
    } else {
        printf("%d is not an Armstrong number\n", n);
    }
    return 0;
}
