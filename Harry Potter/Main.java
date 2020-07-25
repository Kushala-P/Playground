#include<iostream>
using namespace std;
int main()
{
  int num,i=0,last,first,res[10];
  std::cin>>num;
  while(num!=0)
  {
	  last=num%10;
      res[i]=last;
      i++;
      num=num/10;
  }
  first=res[0]+res[3];
  cout<<first;
}