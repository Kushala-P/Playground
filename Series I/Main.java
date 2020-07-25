#include <iostream>
using namespace std;

int main() 
{
  float n,x=0.5,a=1;
  std::cin>>n;
  while(n>=1)
  {
    std::cout<<x<<" ";
    x=x+a;
    a=a*3;
    n--;
  }
  return 0;
}