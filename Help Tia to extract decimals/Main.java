#include<iostream>
#include<string>
int main() 
{ 
  int i,j;
  std::string fnum;
  std::cin>>fnum;
  std::cout<<"Floating part is : ";
  for(i=0;i<fnum.length();i++)
    if(fnum[i]=='.')
    {
      for(j=i+1;j<fnum.length();j++)
      	std::cout<<fnum[j];
    }
}