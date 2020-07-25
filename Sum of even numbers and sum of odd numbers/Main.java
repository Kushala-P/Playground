#include<iostream>
using namespace std;
int main()
{
  int n,a[10],i,evensum=0,oddsum=0;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
     if(a[i]%2==0)
        evensum+=a[i];
      else
        oddsum+=a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<evensum<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<oddsum<<"\n";
  return 0;
}