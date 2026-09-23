#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int largest = 0;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit > largest) {
            largest = digit;
        }
        temp = temp / 10;
    }
    printf("Largest digit: %d\n", largest);
    return 0;
}
