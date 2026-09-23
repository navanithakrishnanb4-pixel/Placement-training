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
    int found = 0;
    for (int i = n - 1; i >= 0; i--) {
        if (a[i] % 2 == 0) {
            printf("Last even number is: %d\n", a[i]);
            found = 1;
            break;
        }
    }
    if (found == 0) {
        printf("No even number found\n");
    }
    return 0;
}
