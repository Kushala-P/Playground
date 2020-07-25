#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],i,j,sum=0;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        std::cin>>a[i][j];
  for(i=0;i<r;i++)
  {
    sum=0;
      for(j=0;j<c;j++)
      {
        sum+=a[i][j];
      }
    std::cout<<sum<<"\n";
  }
  return 0;
}