#include<iostream>
using namespace std;
int main()
{
  int target,n1,sum,count=1;
  std::cin>>target>>n1;
  sum=n1;
  while(sum<target)
  {
    std::cin>>n1;
    sum+=n1;
    count++;
  }
  std::cout<<"The number of turns is "<<count;
}