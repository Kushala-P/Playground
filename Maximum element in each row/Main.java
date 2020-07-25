#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],i,j,max=0;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<r;i++)
  {
    max=a[i][0];
    for(j=0;j<c;j++)
    {
   		if(a[i][j]>max)
          max=a[i][j];
    }
    std::cout<<max<<"\n";
  }
  return 0;
}