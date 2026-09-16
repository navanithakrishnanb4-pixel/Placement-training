#include <stdio.h>
#include <stdlib.h>
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &a[i]);
    }
    printf("Elements in even indices:\n");
    for (int i = 0; i < n; i += 2) {
        printf("%d\n", a[i]);
    }
    free(a);
    return 0;
}