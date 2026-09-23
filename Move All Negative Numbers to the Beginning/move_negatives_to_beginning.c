#include <stdio.h>
int main() {
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n], result[n];
    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &a[i]);
    }
    int index = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] < 0) {
            result[index] = a[i];
            index++;
        }
    }
    for (int i = 0; i < n; i++) {
        if (a[i] >= 0) {
            result[index] = a[i];
            index++;
        }
    }
    printf("Array after moving all negative numbers to the beginning:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\n", result[i]);
    }
    return 0;
}
