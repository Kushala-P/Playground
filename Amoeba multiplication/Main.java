#include<iostream>
using namespace std;
int main()
{
  int mon,x=0,y=1,sum=0,count=0,i;
  std::cin>>mon;
 for(i=2;i<mon;i++)
  {
    sum=x+y;
    x=y;
    y=sum;
  }
  std::cout<<sum;
}