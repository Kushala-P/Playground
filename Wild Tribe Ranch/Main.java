#include <iostream>
using namespace std;

int main() 
{
  int max=85,cur=54;
  cin>>max>>cur;
  if(cur<max)
    cout<<"Yes, you can enter.";
  else if(cur==max)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}