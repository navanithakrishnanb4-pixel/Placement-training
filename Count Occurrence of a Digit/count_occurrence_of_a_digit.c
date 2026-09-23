#include <stdio.h>
#include <stdlib.h>
int main() {
    int n, d;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("Enter the digit to search for: ");
    scanf("%d", &d);
    int temp = abs(n);
    int count = 0;
    while (temp > 0) {
        if (temp % 10 == d) {
            count++;
        }
        temp = temp / 10;
    }
    printf("Occurrence of digit %d is: %d\n", d, count);
    return 0;
}
