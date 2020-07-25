#include <iostream>
using namespace std;

int main() 
{
  int n1=45,n2=84;
  std::cin>>n1>>n2;
 if(n1<n2)
    std::cout<<n1<<" is smallest number";
  else
    std::cout<<n2<<" is smallest number";
  return 0;
}