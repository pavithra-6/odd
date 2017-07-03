#include<stdio.h>
#include<conio.h>
void main(){
int num1,num2,*ptr1,*ptr2,sum;
printf("enter the integer to add\n");
scanf("%d%d",&num1,&num2);
ptr1=&num1;
ptr2=&num2;
sum=*ptr1+*ptr2;
printf("the sum of 2 numbrer is %d\n",sum);getch();
}
