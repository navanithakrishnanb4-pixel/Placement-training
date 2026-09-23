#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int found = 0;
    if (temp == 0) {
        found = 1;
    }
    while (temp > 0) {
        if (temp % 10 == 0) {
            found = 1;
        }
        temp = temp / 10;
    }
    if (found == 1) {
        printf("%d contains the digit 0\n", n);
    } else {
        printf("%d does not contain the digit 0\n", n);
    }
    return 0;
}
