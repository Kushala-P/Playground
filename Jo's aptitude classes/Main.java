#include <iostream>
using namespace std;

int main() 
{
  int n1,n2,n3,ans,small=0,gcd=0;
  std::cin>>n1>>n2>>n3>>ans;
  small=(n1<n2)?(n1<n3?n1:n3):(n2<n3?n2:n3);
  while(small>=1)
  {
    if(n1%small==0 && n2%small==0 && n3%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  if(small==ans)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
  return 0;    
}