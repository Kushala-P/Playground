#include<iostream>
using namespace std;
int main()
{
  int row,col,no,col2,col3,col4,col5,row2;
  std::cin>>row>>col>>no;
  col2=col*2;
  col3=col*3;
  col4=col*4;
  col5=col*5;
  row2=row*2;
  if(no>1&&no<=col)
    cout<<"Yes";
  else if(no==col||no==col2||no==col3||no==col4||no==col5)
    cout<<"Yes\n";
  else if(no==col+1||no==col2+1||no==col3+1||no==col4+1||no==col5+1)
    cout<<"Yes";
  else
    cout<<"No\n";
}