#include<iostream>
using namespace std;
int main()
{
  int no,i=0,sum=0;
  std::cin>>no;
  for(i=1;i<no;i++)
  {
    sum=sum+i;
  }
  std::cout<<sum;
  return 0;   
}