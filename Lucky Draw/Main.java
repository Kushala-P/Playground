#include <iostream>
using namespace std;

int main() 
{
  int n,i,j;
  std::cin>>n;
  for(i=1; i <= n; i++)
  {
	if ((n % i) == 0)
	   j++;
  }

  if(j==2)
  	std::cout<<"Eligible";
  else
	std::cout<<"Not eligible";
 /* if (num==2)
    std::cout<<"Eligible";
  else if(num%2==0)
    std:cout<<"Not eligible";
  else
    std::cout<<"Eligible";*/
}