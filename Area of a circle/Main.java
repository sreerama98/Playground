#include<stdio.h>
int main()
{
  int d,n;
  float area,r;
  scanf("%d",&d);
  r=(float)d/2;
  area=3.14*r*r;
  n=area;
  if(n==area)
    printf("%d",n);
  else
    printf(" %.2f",area);
  //Type your code here
  return 0;
} 