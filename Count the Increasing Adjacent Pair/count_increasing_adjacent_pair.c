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
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
        if (a[i] < a[i + 1]) {
            count++;
        }
    }
    printf("Count of increasing adjacent pairs: %d\n", count);
    return 0;
}
