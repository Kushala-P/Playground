#include<iostream>
using namespace std;
int main()
{
  int no_mugs,vol_cups,a[5],sum=0,i;
  std::cin>>no_mugs>>vol_cups;
  for(i=0;i<no_mugs;i++)
  	std::cin>>a[i];
  for(i=0;i<no_mugs;i++)
    sum+=a[i];
  if(sum<=vol_cups)
    std::cout<<"YES";
  else
    std::cout<<"NO";
  return 0;
}