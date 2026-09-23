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
    printf("Enter the number to compare: ");
    scanf("%d", &x);
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] > x) {
            count++;
        }
    }
    printf("Count of elements greater than %d is: %d\n", x, count);
    return 0;
}
