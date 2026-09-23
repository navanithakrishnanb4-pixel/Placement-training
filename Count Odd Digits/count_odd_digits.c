#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    int count = 0;
    while (temp > 0) {
        if ((temp % 10) % 2 != 0) {
            count++;
        }
        temp = temp / 10;
    }
    printf("Count of odd digits: %d\n", count);
    return 0;
}
