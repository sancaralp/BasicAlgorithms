#include <stdio.h>
#include <stdbool.h>

bool isPrime(int,int);
int main()
{
    int num;
    printf("\n-------------------------------------------------------------------------\nEnter a non-positive number to exit.");
    printf("\n-------------------------------------------------------------------------\n\n\n");
    do{

    printf("Enter the number that you wish to check if it is a prime number or not: ");
    scanf("%d",&num);

    printf("\nGiven number is %s",isPrime(num,2)?"a prime number.":"not a prime number.");

    printf("\n\n\n-------------------------------------------------------------------------\n\n\n");
    }
    while(num>0);
    return 0;
}
bool isPrime(int num, int tester){
    if(num%tester==0)return false;
    if(tester>num/2)return true;
    return isPrime(num,tester+1);
}
