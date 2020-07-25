#include<iostream>
using namespace std;
int main()
{
  int num,count=0;
  std::cin>>num;
  std::cout<<num<<"\n";
  while(num!=1)
  {
    if(num%2==0)
    {
    	num=num/2;
      	std::cout<<num<<"\n";
    }
    else if(num%2==1)
    {
      num=num*3+1;
      std::cout<<num<<"\n";
    }
    count++;
  }
  std::cout<<count;
}