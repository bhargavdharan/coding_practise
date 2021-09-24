// write a program to convert milli gram to kilo gram

#include<stdio.h> 

int main()  
{
    float kg, mg;

    printf("Enter in milligrams: ");
    scanf("%f", &mg);

    kg = mg / 1000000;
    printf("Kilograms = %f\n",kg);
    return 0;
}