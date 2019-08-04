#include<stdio.h>
int main()
{
  int n,a[10],c,k,f=-1,g=-1,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&c,&k);
  for(i=0;i<n;i++)
  {
    if(c==a[i] && f==-1)
    { 
      f=i;
    }
    if(k==a[i] && g==-1)
    { g=i;
      }
  }
    printf("Element 1 index = %d\nElement 2 index = %d",f,g);

  	//type your code here
}