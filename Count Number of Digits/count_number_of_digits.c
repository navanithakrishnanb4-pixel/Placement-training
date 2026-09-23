#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int count = 0;
    if (temp == 0) {
        count = 1;
    }
    while (temp > 0) {
        count++;
        temp = temp / 10;
    }
    printf("Number of digits: %d\n", count);
    return 0;
}
