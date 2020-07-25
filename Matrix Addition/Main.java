#include<iostream>
using namespace std;
int main()
{
  int r,c,a[5][5],b[5][5],i,j,res[5][5];
  std:cin>>r;
  std::cin>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>b[i][j];
  
  for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
      res[i][j]=a[i][j]+b[i][j];
    }
  }
  
   for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
      std::cout<<res[i][j]<<" ";
    }
     std::cout<<"\n";
   }
   return 0;
}