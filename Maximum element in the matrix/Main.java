#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[10][10],max;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  max=a[0][0];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
  }
  std::cout<<"The maximum element is "<<max;
}