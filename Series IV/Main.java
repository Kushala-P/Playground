#include<iostream>
using namespace std;
int main()
{
  int n,z=0,x=2,count=0,k=6;
  std::cin>>n;
  std::cout<<z<<" ";
  while(n!=1)
  {
    std::cout<<x<<" ";
    if(count<=2)
    {
      x=x+k;
      count++;
    }
    if(count==2)
    {
      count=0;
      k=k+4;
    }
    n--;
  }
}