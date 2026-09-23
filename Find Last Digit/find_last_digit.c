#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int last_digit = abs(n) % 10;
    printf("The last digit is: %d\n", last_digit);
    return 0;
}
