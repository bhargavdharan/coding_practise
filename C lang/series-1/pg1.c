// input two numbers and find avg of two numbers

#include<stdio.h> 

int main()  
{
    float a, b, avg;
    printf("Enter the two numbers: ");
    scanf("%f %f", &a, &b);

    avg = (a + b) / 2;
    printf("Average of %.2f and %.2f is %.2f\n",a,b,avg);
    return 0;
}