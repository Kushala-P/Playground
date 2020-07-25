#include<iostream>
using namespace std;
struct college 
{ 
  char name[100]; 
  char city[100]; 
  int ey; 
  float pp; 
}; 
int main()
{
  int no,i;
  std::cout<<"Enter the number of colleges \n";
  std::cin>>no;
  college coll[no];
  for(i=1;i<=no;i++)
  {
    std::cout<<"Enter the details of college "<<i<<"\n";
    std::cout<<"Enter name \n";
    std::cin>>coll[i].name;
    std::cout<<"Enter city \n";
    std::cin>>coll[i].city;
    std::cout<<"Enter year of establishment \n";
    std::cin>>coll[i].ey;
    std::cout<<"Enter pass percentage \n";
    std::cin>>coll[i].pp;
  }
  std::cout<<"Details of colleges \n";
  for(i=1;i<=no;i++)
  {
    std::cout<<"College:"<<i<<"\n";
    std::cout<<"Name:"<<coll[i].name<<"\n";
    std::cout<<"City:"<<coll[i].city<<"\n";
    std::cout<<"Year of establishment:"<<coll[i].ey<<"\n";
    std::cout<<"Pass percentage:"<<coll[i].pp<<"\n";
  }
  return 0;
}