#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,totd=0,totc=0;
  std::cin>>d1>>c1>>d2>>c2;
  totd=d1+d2;
  totc=c1+c2;
  if(totc>=100)
  {
    totc=totc-100;
    totd=totd+1;
  }
  std::cout<<totd<<"\n";
  std::cout<<totc;
}