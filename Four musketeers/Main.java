#include<iostream>
using namespace std;
int main()
{
  float x1=2.00000,y1=4.00000,x2=10.00000,y2=15.00000,x3=5.00000,y3=8.00000,cx=0.00000,cy=0.00000;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  cx = (x1+x2+x3)/3;
  cy = (y1+y2+y3)/3;
  std::cout<<cx<<"\n"<<cy;
}