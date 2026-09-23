#include <stdio.h>
int main() {
    int n, square, temp1, temp2;
    printf("Enter a number: ");
    scanf("%d", &n);
    square = n * n;
    temp1 = n;
    temp2 = square;
    int digitsN = 0;
    while (temp1 > 0) {
        temp1 = temp1 / 10;
        digitsN++;
    }
    int divisor = 1;
    for (int i = 0; i < digitsN; i++) {
        divisor = divisor * 10;
    }
    if (square % divisor == n) {
        printf("%d is an automorphic number\n", n);
    } else {
        printf("%d is not an automorphic number\n", n);
    }
    return 0;
}
