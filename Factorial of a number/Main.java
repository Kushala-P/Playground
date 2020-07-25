#include<iostream>
int main()
{
  int n,i,fact=1;
  std::cin>>n;
  for(i=n;i>=1;i--)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}