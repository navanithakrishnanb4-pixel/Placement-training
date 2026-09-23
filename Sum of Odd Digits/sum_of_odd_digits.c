#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int total = 0;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit % 2 != 0) {
            total = total + digit;
        }
        temp = temp / 10;
    }
    printf("Sum of odd digits: %d\n", total);
    return 0;
}
