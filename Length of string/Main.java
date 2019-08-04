#include<stdio.h>
#include<string.h>
int main()
{
  char a[20];
  int l,i;
  gets(a);
  for(i=0;a[i]!='\0';i++);
  printf("%d",i); 
  //Type your code here
  return 0;
}