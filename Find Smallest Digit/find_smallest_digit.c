#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int smallest = 9;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit < smallest) {
            smallest = digit;
        }
        temp = temp / 10;
    }
    printf("Smallest digit: %d\n", smallest);
    return 0;
}
