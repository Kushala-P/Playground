#include<iostream>
using namespace std;
int main()
{
  int r=5,c=5,no=20,cur=0,tot=0;
  std::cin>>r>>c>>no;
  tot=r*c;
  cur=tot-no;
  //if(cur%c==no)
  if(r+c==no||(r+c)*2==no)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}