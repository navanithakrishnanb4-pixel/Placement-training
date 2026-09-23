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
    int x;
    printf("Enter the number to search: ");
    scanf("%d", &x);
    int index = -1;
    for (int i = n - 1; i >= 0; i--) {
        if (a[i] == x) {
            index = i;
            break;
        }
    }
    printf("Last occurrence index: %d\n", index);
    return 0;
}
