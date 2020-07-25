#include <iostream>
using namespace std;
int main() 
{
  int n,i,j,k;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<=n-1;j++)
        cout<<i;
      cout<<i+1<<"\n";
    }
    else
    {
      cout<<i+1; 
      for(k=1;k<=n-1;k++)
        cout<<i;
      cout<<"\n";
    }
  }
  return 0;
}