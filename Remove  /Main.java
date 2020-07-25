#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int j,i;
  std::string s;
  std::getline(std::cin,s);
  int len=s.length();
  for(i=0;i<len;i++)
  {
    if(s[i]=='t'&&s[i+1]=='h'&&s[i+2]=='e')
    {
      i=i+3;
      continue;
    }
    else
    	std::cout<<s[i];
  }
  return 0;
}