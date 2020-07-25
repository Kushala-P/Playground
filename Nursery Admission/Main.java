#include<iostream>
#include<string>
using namespace std;
int main()
{
  int i,count=0;
   std::string name;
   std::cin>>name;
   for(i=0;name[i]!='\0';i++)
     count++;
   std::cout<<"The number of letters in the name is "<<count;
   return 0;
}