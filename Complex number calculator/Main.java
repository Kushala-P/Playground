#include <iostream>
using namespace std;
int main() 
{
  int ch,a,b,c,d;
  std::cin>>ch>>a>>b>>c>>d;
  switch(ch)
  {
    case 1: cout<<(a+c)<<"+"<<(b+d)<<"i";   
   			break;
    case 2: cout<<(a-c)<<"+"<<(b-d)<<"i";
      		break;
    case 3: cout<<(a*c)-(b*d)<<(b*c)+(a*d)<<"i";
      		break;
    default:cout<<"Invalid choice";
  }
  return 0;
}