#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,k=1;
  cin>>n;
  for(i=n;i<=n+3;i++)
  {
    for(j=n;j<=i;j++)
    {
      cout<<i;
    }
    cout<<"\n";
  }
  for(i=n+3;i>=n;i--)
  {
    for(j=n;j<=i;j++)
    {
      cout<<i;
    }
    cout<<"\n";
  }
  return 0;
}