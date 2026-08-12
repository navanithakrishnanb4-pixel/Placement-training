#include <stdio.h>
#include <math.h>
int main(){
    int n, i, a = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    if(n > 1){
        for(i = 2; i <= sqrt(n); i++){
            if(n % i == 0){
                a = 1;
                break;
            }
        }
        if(a == 0)
            printf("%d is a prime number\n", n);
        else
            printf("%d is not a prime number\n", n);
    }
    else
        printf("%d is not a prime number\n", n);
    return 0;
}