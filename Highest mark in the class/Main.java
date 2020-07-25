#include<iostream>
int main()
{
  int n,m[10],i,max=0;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>m[i];
  int val=m[0];
  for(i=1;i<n;i++)
  {    
    if(m[i]>val)
    	val=m[i];
  }
  std::cout<<val;
  return 0;
}