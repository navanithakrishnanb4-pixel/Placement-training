#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int product = 1;
    while (temp > 0) {
        product = product * (temp % 10);
        temp = temp / 10;
    }
    printf("Product of digits: %d\n", product);
    return 0;
}
