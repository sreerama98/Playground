#include<stdio.h>
#include<string.h>
int main()
{
  int c=0,i,l;
  char a[50];
  scanf("%s",&a);
  l=strlen(a);
  if(l>20)
  {
    printf("Invalid Input");
  }
  else 
  {
    for(i=0;i<l;i++)
    {
      if(a[i]==a[i+1])
      {
        c++;
      }
      else
      {
        printf("%c%d",a[i],c+1);
        c=0;
      }
    }
  }
    
	//type your code here
}