#include<iostream>
int main()
{
  int n,a[10],reg,flag=0,i;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>reg;
  for(i=0;i<n;i++)
  {
    if(reg==a[i])
    {
       flag=1;
       break;
    }
   }
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
  return 0;
}