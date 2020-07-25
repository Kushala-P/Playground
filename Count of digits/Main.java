#include<iostream>
int main()
{
  int n,r,t=0;
  std::cin>>n;
  do
  {
    n=n/10;
    t++;
  }while(n!=0);
  std::cout<<t;
}