#include<iostream>
using namespace std;
int main()
{
  int p=100,r=1,t=10,d=2;
  float si=0.00,amt=0.00,finalamt=0.00,newd=0.00;
  std::cin>>p>>r>>t>>si>>d>>amt>>finalamt>>newd;
  si=p*t*r/100;
  amt=si+p;
  newd=si*d/100;
  finalamt=amt-newd;
  std::cout<<si<<"\n"<<amt<<"\n"<<newd<<"\n"<<finalamt;
}