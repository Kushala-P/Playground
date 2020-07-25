#include<iostream>
using namespace std;
int main()
{
  int no=200,sp=3,cp=1,totcp=0,totsp=0,profit=0,delivery=100;
  std::cin>>no>>sp>>cp;
  totcp=no*cp;
  totsp=no*sp;
  profit=totsp-totcp-delivery;
  std::cout<<profit;
}