#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int bx=3,by=4,fx=5,fy=10,distx=0,disty=0,x=0,y=0,d=0,dist=0;
  std::cin>>fx>>fy;
  distx=fx-bx;
  disty=fy-by;
  x=distx*distx;
  y=disty*disty;
  d=x+y;
  dist=sqrt(d);
  std::cout<<dist;
}