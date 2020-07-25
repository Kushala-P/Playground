#include<iostream>
using namespace std;
int main()
{
  int units=200,bill=0,res=0;
  float ans=0.00;
  std::cin>>units;
  if(units<=200)
  {
    ans =0.5*units ;
    res  = (int)ans;
    cout<<"Rs."<<res;
  }  
  else if(units<=400)
  {  
    ans= 0.65*units+100;
    res = (int)ans;
    cout<<"Rs."<<res;
  }  
  else if(units<=600)
  {  
    ans = 0.80*units+200;
    res = (int)ans;
    cout<<"Rs."<<res;
  }  
  else if(units>600)
  {
    ans = 5*units+425;
    res = (int)ans;
    cout<<"Rs."<<res;
  } 
}