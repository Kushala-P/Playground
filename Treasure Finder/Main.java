#include<iostream>
using namespace std;
int main()
{
  int first,second,third,st=0,i,t;
  std::cin>>first>>second>>third;
  if(first>second && first<third)
    cout<<"The treasure is in box which has number "<<first;
  else if(second>first && second<third)
    cout<<"The treasure is in box which has number "<<second;
  else if(third>first && third<second)
    cout<<"The treasure is in box which has number "<<third;
  else if(first>third && first<second)
    cout<<"The treasure is in box which has number "<<first;
  else if(second>third && second<first)
    cout<<"The treasure is in box which has number "<<second;
  else if(third>second && third<first)
    cout<<"The treasure is in box which has number "<<third;
   st=first<second?(first<third?first:third):(second<third?second:third);
   for(i=st;i>=1;i--)
   { 
    if(first%i==0 && second%i==0 && third%i==0)
      break;
   }
   cout<<"\nThe code to open the box is "<<i;
}