#include<iostream>
int fact(int n)
{
  if(n>1)
    return n*fact(n-1);
  else
    return 1;
}
int main()
{
  int n,f=0;
  std::cin>>n;
  f=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<f;
  return 0;  
}