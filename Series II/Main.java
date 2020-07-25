#include <iostream>
using namespace std;

int main() 
{
  int n,x=121,a=104;
  std::cin>>n;
  while(n!=0)
  {
    std::cout<<x<<" ";
    x=x+a;
    a=a+32;
    n--;
  }
  return 0;
}