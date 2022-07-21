#include <stdio.h>
#include <stdlib.h>
int fibonacci(int);
int main()
{
   int num;
    printf("\n-------------------------------------------------------------------------\nEnter a non-positive number to exit.");
    printf("\n-------------------------------------------------------------------------\n\n\n");
    do{

    printf("Enter the number: ");
    scanf("%d",&num);

    printf("\n%d. fibonacci number is: %d",num,fibonacci(num));
    printf("\nFirst %d numbers of the fibonacci series are: ");
    for(int i=1;i<num;i++){
            int x=fibonacci(i);
        if(x<0) break;
        printf("%d ",x);
    }
        printf("|%d|",fibonacci(num));

    printf("\n\n\n-------------------------------------------------------------------------\n\n\n");
    }
    while(num>0);
    return 0;
}
int fibonacci(int n){
    if(n<2) return n;
    return fibonacci(n-1)+fibonacci(n-2);
}
