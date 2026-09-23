#include <stdio.h>
int main() {
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &a[i]);
    }
    if (n % 2 != 0) {
        printf("Middle element: %d\n", a[n / 2]);
    } else {
        printf("Middle elements: %d and %d\n", a[n / 2 - 1], a[n / 2]);
    }
    return 0;
}
