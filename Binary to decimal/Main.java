#include<stdio.h>
#include<math.h>
int main()
{ 
  int a,m,sum=0,n,i=0;
  scanf("%d",&a);
  while(a!=0)
  {
    m=a%10;
    n=m*pow(2,i);
    sum=sum+n;
    a=a/10;
    i++;
  }
  printf("%d",sum);
   
  
  
  //Type your code here
  return 0;
}