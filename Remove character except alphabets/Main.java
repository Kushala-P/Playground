#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int i,len=0;
  std::string str1;
  std::getline(std::cin,str1);
  len=str1.length();
  for(i=0;i<=len;i++)
  {
    if((str1[i]>='a'&&str1[i]<='z')||(str1[i]>='A'&&str1[i]<='Z'))
    	std::cout<<str1[i];
  }
  return 0;
}