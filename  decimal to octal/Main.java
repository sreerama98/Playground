#include<stdio.h>
int main()
{
  int n,i=0,b[32];
  scanf("%d",&n);
  while(n!=0)
  {
    b[i++]=n%8;
    n=n/8;
  }
  for(i=i-1;i>=0;i--)
    printf("%d",b[i]);
  //type your code here
  return 0;
}