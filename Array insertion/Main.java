#include<iostream>
using namespace std;
int main()
{
  int n,a[10],loc,val=0,i,extra=0,temp=0;
  std::cout<<"Enter the number of elements in the array \n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array \n";
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<"Enter the location where you wish to insert an element \n";
  std::cin>>loc;
  if(loc>n)
    std::cout<<"Invalid Input";
  else 
  {
    std::cout<<"Enter the value to insert \n";
    std::cin>>val;
    std::cout<<"Array after insertion is \n"; 
    for(i=n-1;i>=loc-1;i--)
    {
      a[i+1]=a[i];
    }
    a[loc-1]=val;
    for(i=0;i<=n;i++)
       std::cout<<a[i]<<"\n";
  }
  return 0;
}