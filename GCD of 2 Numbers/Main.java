#include<iostream>
int gcd(int n1,int n2)
{
  if(n1>n2)
    return gcd(n1-n2,n2);
  else if(n2>n1)
    return gcd(n1,n2-n1);
  else 
    return n1;
}
int main()
{
  int n1,n2,result=0;
  std::cin>>n1>>n2;
  result=gcd(n1,n2);
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<result;
}