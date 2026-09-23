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
    int pos1, pos2;
    printf("Enter first position (0-based index): ");
    scanf("%d", &pos1);
    printf("Enter second position (0-based index): ");
    scanf("%d", &pos2);
    int temp = a[pos1];
    a[pos1] = a[pos2];
    a[pos2] = temp;
    printf("Array after swapping the given positions:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\n", a[i]);
    }
    return 0;
}
