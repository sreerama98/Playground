#include<stdio.h>

int main()
{ int sp=0,i;
  char a[100];
  gets(a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
      sp++;
  }
  printf("%d",sp+1);
  //Type your code here
  
}