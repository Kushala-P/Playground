#include<iostream>
using namespace std;
int main()
{
  int birth=62,curr=00,c=0,b=0;
  std::cin>>birth>>curr;
  if(birth>curr)
  {
    b=1900+birth;
    c=2000+curr;
    std::cout<<c-b;
  }
  else
  {
    b=2000+birth;
    c=2000+curr;
    std::cout<<c-b;
  } 
}