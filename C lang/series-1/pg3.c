#include<stdio.h> 

int main()  
{
    float km, mm;

    printf("Enter the distance in km:");
    scanf("%f", &km);

    mm = 1000000 * km;
    printf("Distance in millimeters: \n");
    printf("%f", mm);
    return 0;
}