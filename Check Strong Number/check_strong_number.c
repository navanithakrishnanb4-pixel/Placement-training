#include <stdio.h>
int main() {
    int n, temp, digit, total = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    temp = n;
    while (temp > 0) {
        digit = temp % 10;
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        total = total + fact;
        temp = temp / 10;
    }
    if (total == n) {
        printf("%d is a strong number\n", n);
    } else {
        printf("%d is not a strong number\n", n);
    }
    return 0;
}
