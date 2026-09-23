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
    printf("Elements greater than the previous element:\n");
    for (int i = 1; i < n; i++) {
        if (a[i] > a[i - 1]) {
            printf("%d\n", a[i]);
        }
    }
    return 0;
}
