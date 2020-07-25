#include <iostream>
using namespace std;

int main() 
{
  int n,x=6,a=5;
  std::cin>>n;
  while(n!=0)
  {
   std::cout<<x<<" ";
   x=x+a;
   a=a+5;
   n--;
  }
  return 0;
}