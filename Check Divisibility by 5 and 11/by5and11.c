#include <stdio.h>
int main(){
    int a;
    printf("Enter a number: ");
    scanf("%d", &a);
    if ( a % 5 == 0 && a % 11 == 0) {
        printf("The number is divisible by both 5 and 11.\n");
    } else if (a % 5 == 0) {
        printf("The number is divisible by 5 but not by 11.\n");
    } else if (a % 11 == 0) {
        printf("The number is divisible by 11 but not by 5.\n");
    } else {
        printf("The number is not divisible by both 5 and 11.\n");
    }
    return 0;
}