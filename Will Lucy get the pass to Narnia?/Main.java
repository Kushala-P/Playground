#include <iostream>
using namespace std;

int main() 
{
   int n1=25,n2=45,menu=1;
  cout<<"Enter first number : Enter second number : Menu \n";
  cin>>n1>>n2>>menu;
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(menu)
  {
    case 1: cout<<n1+n2;
      		break;
    case 2: cout<<n1-n2;
      		break;
    case 3: cout<<n1*n2;
      		break;
    case 4: cout<<n1/n2;
      		break;
    case 5: cout<<n1%n2;
      		break;
    default: cout<<"Invalid operation";
  }   
}