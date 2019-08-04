#include<stdio.h>
int main()
{ 
  int n,flag=0,k,a[10],i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(k==a[i])
    {
      printf("%d ",i+1);
      flag=1;
    }
  }
  if(flag==0)
  {
    printf("%d isn't present in the array.",k);
  }
      
  //Type your code here
  return 0;
}