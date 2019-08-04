#include<stdio.h>
int main()
{ 
  int  a,n,d,t,n1;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0;d=2;
    t=(n+1)/2;
    n1=a+(t-1)*d;
    printf("%d",n1);
  }
  else
  {
    a=0;d=1;
    t=n/2;
    n1=a+(t-1)*d;
    printf("%d",n1);
  }
	//type your code here
	
}