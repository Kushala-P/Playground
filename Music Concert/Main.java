#include<iostream>
#include<cstdlib>
int main()
{
  int n,i,cm=0,cf=0;
  std::cin>>n;
  int *ptr=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
    std::cin>>*(ptr+i);
  for(i=0;i<n;i++)
  {
    if(*(ptr+i)%2==0)
      cf++;
    else
      cm++;
  }
  std::cout<<cm<<"\n"<<cf;
  return 0;
}