#include<iostream>
using namespace std;
int main()
{
  float milage=11.00,newmil=0.00;
  int petrol=6,dist=67;
  std::cin>>milage>>petrol>>dist;
  newmil=petrol*milage;
  if(newmil>dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
    
}