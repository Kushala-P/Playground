#include<iostream>
int main()
{
  int r,c,a[5][5],i,j,*temp;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
 /*  for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
      temp=a[i];
  	  a[i]=a[j];
      a[j]=temp;
    }
   }*/
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  return 0;
}