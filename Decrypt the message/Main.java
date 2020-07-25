#include <iostream>
using namespace std;

int main() 
{
  int enc=12,ter=14,sum,div,num=0;
  std::cin>>enc>>ter;
  num=enc+ter;
  for(int i =1;i<num;i++)
  {
    if(num%i==0)
      sum=sum+i;
  }
  if(sum==num)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message" ;  
  return 0;
}