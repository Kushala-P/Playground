#include <iostream>
using namespace std;

int main() 
{
  int start,end;
   int sum,p,i;
  std::cin>>start>>end;
  for(i=start;i<end;i++)
  {
   p=1;
   while(p<=(i/2))
    {
      if(i%p==0)
        sum=sum+p;
        p++;
    }
    if(sum==i)
      cout<<i<<" ";
    sum=0;
  }
  return 0;
}