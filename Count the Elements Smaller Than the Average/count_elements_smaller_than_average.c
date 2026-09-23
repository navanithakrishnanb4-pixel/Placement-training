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
    for (int i = 0; i < n; i++) {
        total = total + a[i];
    }
    double average = (double) total / n;
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] < average) {
            count++;
        }
    }
    printf("Average is: %.2f\n", average);
    printf("Count of elements smaller than average: %d\n", count);
    return 0;
}
