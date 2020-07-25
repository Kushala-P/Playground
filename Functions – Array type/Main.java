#include<iostream>
using namespace std;
int main()
{
  int n,a[10],i,odd=0,even=0;
  std::cout<<"Enter the number of elements in the array \n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array \n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      even++;
    else 
      odd++;
  }
  if(even==n)
    std::cout<<"The array is Even";
  else if(odd==n)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
  return 0;
}