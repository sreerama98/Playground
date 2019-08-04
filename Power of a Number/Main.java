#include <stdio.h>
#include<math.h>
int main()
{ int n,a,p;
  scanf("%d%d",&n,&a);
  if(a<0)
  {
    printf("Wrong input");
  }
 else
 {
   p=pow(n,a);
   printf("%d",p); 
 }
 
   
  	//Your code here       
    return 0;
}