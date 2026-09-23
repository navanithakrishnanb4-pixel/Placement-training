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
    int total = 0;
    for (int i = 0; i < n; i += 2) {
        total = total + a[i];
    }
    printf("Sum of elements in even index: %d\n", total);
    return 0;
}
