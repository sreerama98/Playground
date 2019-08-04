#include<stdio.h>
#include<string.h>
int main()
{
  char a[30],b[30],c[30];
  scanf("%s%s%s",&a,&b,&c);
  int s,d,f,i;
  s=strlen(a);
  d=strlen(b);
  f=strlen(c);
  for(i=0;i<s;i++)
  {
    if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='I'||a[i]=='i'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
      a[i]='$';
  }
  printf("%s",a);
  for(i=0;i<d;i++)
  {
    if(!(b[i]=='a'||b[i]=='A'||b[i]=='e'||b[i]=='E'||b[i]=='I'||b[i]=='i'||b[i]=='o'||b[i]=='O'||b[i]=='u'||b[i]=='U'))
    b[i]='#';        
  }
  printf("%s",b);
  for(i=0;i<f;i++)
  {
    if(c[i]>='a' && c[i]<='z')
      c[i]=c[i]-32;
  }
  printf("%s",c);
  
  // type your code here 
}