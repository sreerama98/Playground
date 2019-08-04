#include<stdio.h>
int main()
{
  float r,ang,len;
  scanf("%f%f",&r,&ang);
  ang/=360;
  len=ang*r*2*3.14;
  printf("%.2f",len);
  return 0;
}