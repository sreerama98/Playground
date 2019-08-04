#include <stdio.h>
#include<string.h>
int main() {
  char a;
  scanf("%c",&a);
  if(a>='A'&&a<='Z')
    printf("%c",a+32);
  else
    printf("%c",a-32);
	// Type your code here
	return 0;
}