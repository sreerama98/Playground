#include<stdio.h>
int main()
{ int a,b,i,gcd,lcm;
 scanf("%d%d",&a,&b);
 if(a>b){
 for(i=1;i<a;i++)
 { 
   if(a%i==0 && b%i==0)
     gcd=i;
 }
 lcm=(a*b)/gcd;
 printf("%d",lcm);
 }
 else{
   for(i=1;i<b;i++)
 { 
   if(a%i==0 && b%i==0)
     gcd=i;
 }
 lcm=(a*b)/gcd;
 printf("%d",lcm);}
  //Type your code here
  return 0;
}