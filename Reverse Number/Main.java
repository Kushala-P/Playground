#include <iostream>
int main() 
{
	int q,n=0,rev,t,r;
    std::cin>>q;
  	n=q;
    t=0;
    r=0;
    while(n>0)
    {
      t=n%10;
      r=t%10;
      std::cout<<r;
  	  n=n/10;
    }
}