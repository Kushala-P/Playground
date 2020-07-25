#include<iostream>
using namespace std;
int main()
{
  int max=600,adults=7,children=4,adultwt=0,childrenwt=0;
  std::cin>>max>>adults>>children;
  adultwt=adults*75;
  childrenwt=children*30;
  if(adultwt+childrenwt<max)
    std::cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}