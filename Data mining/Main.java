#include<iostream>
using namespace std;
int main()
{
  int n,temp=0,evensum=0,oddsum=0;
  std::cin>>n;
   while(n!=0)
  {
    temp=n%10;
    if(temp%2==0)
      evensum=evensum+temp;
    else if(temp%2==1)
      oddsum=oddsum+temp;
    n=n/10;
  }
    if(evensum!=oddsum)
      std::cout<<"No";
  	else 
      std::cout<<"Yes";
}