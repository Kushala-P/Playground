#include<iostream>
using namespace std;
int main()
{
  int n,sum,x=0;
  std::cin>>n;
  x=n;
  while(n!=0)
  {
    sum=sum+n%10;
	n=n/10;
  }
  if(x%sum==0) 
  	std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
 }