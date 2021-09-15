#include<math.h>
#include<stdio.h>

int main(void)  
{
    double n;
    double v;

    printf("Enter a number: ");
    scanf("%lf", &n);

    v = sqrt(n);

    printf("Square root of %.2f is %.2f", n, v);
    return 0;
}

// gcc pr3.c - o pr3.exe - lm ===> use linker to run the program