#include <stdio.h>
#include <stdlib.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int temp = abs(n);
    while (temp >= 10) {
        temp = temp / 10;
    }
    printf("The first digit is: %d\n", temp);
    return 0;
}
