#include<iostream>
int main()
{
  int r,c,m1[5][5],m2[5][5],res[5][5],i,j;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>m1[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>m2[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      res[i][j]=m1[i][j]+m2[i][j];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<res[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}