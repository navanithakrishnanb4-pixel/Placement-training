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
    int zero_count = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] == 0) {
            zero_count++;
        } else {
            result[index] = a[i];
            index++;
        }
    }
    for (int i = 0; i < zero_count; i++) {
        result[index] = 0;
        index++;
    }
    printf("Array after moving all 0 to the end:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\n", result[i]);
    }
    return 0;
}
