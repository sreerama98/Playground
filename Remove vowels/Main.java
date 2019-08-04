#include<stdio.h>
#include<string.h>
int isVowel(char str);
int main()
{ int i,j=0;
  char str[100],a[100];
  scanf("%[^\n]s", str);
 int l=strlen(str);
  for(i=0;i<l;i++)
  {
    if(isVowel(str[i]))
       printf("%c",str[i]);
  }
 return 0;
}
 int isVowel(char str){
    if(str=='a'||str=='A'||str=='e'||str=='E'||str=='i'||str=='I'||str=='o'||str=='O'||str=='u'||str=='U')
      return 0;
    else
      return 1;
  }

      
      //Type your code here
  
 
