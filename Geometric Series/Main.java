#include<stdio.h>
#include<math.h>
int main()
{
  int n,s;
  scanf("%d",&n);
  if(n%2==0)
  {   s=pow(3,(n/2-1));
    printf("%d",s);
  }
  else
  {
    s=pow(2,n/2);
    printf("%d",s);
  }
  
  //type your code here
  return 0;
}