#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int vow=0,con=0,ws=0,dig=0,sym=0,i;
  std::string s;
  std::getline(std::cin,s);
  int len=s.length();
  for(i=0;i<len;i++)
  {
    if(s[i]==' ')
      ws++;
    else if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      vow++;
    else if(s[i]>='0'&&s[i]<='9')
      dig++;
    else if((s[i]>='b'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z'))
      con++;
    else
      sym++;
  }
  std::cout<<"Vowels:"<<vow<<"\n";
  std::cout<<"Consonants:"<<con<<"\n";
  std::cout<<"White Spaces:"<<ws<<"\n";
  std::cout<<"Digits:"<<dig<<"\n";
  std::cout<<"Symbols:"<<sym;
  return 0;
}