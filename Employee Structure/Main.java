#include<iostream>
#include<string.h>
using namespace std;
struct emp
{
  std::string name;
  int id,age,salary;
  std::string desgn;
  
};
int main()
{
  emp e1;
  std::cout<<"Enter name: \n";
  std::cin>>e1.name;
  std::cout<<"Enter ID: \n";
  std::cin>>e1.id;
  std::cout<<"Enter age: \n";
  std::cin>>e1.age;
  std::cout<<"Enter designation: \n";
  std::cin>>e1.desgn;
  std::cout<<"Enter Salary: \n";
  std::cin>>e1.salary;
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : "<<e1.name<<"\n";
  std::cout<<"ID of the Employee : "<<e1.id<<"\n";
  std::cout<<"Age of the Employee : "<<e1.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e1.desgn<<"\n";
  std::cout<<"Salary of the Employee : "<<e1.salary;
  return 0;
}