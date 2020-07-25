#include<iostream>
using namespace std;
struct dist
{
  int ft;
  float in;
}d1,d2,sum;
int main()
{
  std::cin>>d1.ft;
  std::cin>>d1.in;
  std::cin>>d2.ft;
  std::cin>>d2.in;
  sum.ft=d1.ft+d2.ft;  
  sum.in=d1.in+d2.in;
  if(sum.in>12)
  {
    ++sum.ft;
    sum.in -=12;
  }
  std::cout<<sum.ft<<"'-"<<sum.in<<'"';
  return 0;
}