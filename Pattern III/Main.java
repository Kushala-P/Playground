#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,k;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      k=j;
      cout<<i;
      if(k>=1&&k<i)
        cout<<"*";
    }
    cout<<"\n";
  }
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      k=j;
      cout<<i;
      if(k>=1&&k<i)
        cout<<"*";
    }
    cout<<"\n";
  }
}