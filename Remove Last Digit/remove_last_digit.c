#include <stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int result = n / 10;
    printf("Number after removing last digit: %d\n", result);
    return 0;
}
