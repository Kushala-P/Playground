#include<iostream>
int fib(int n)
{
 if( n<=1 )
   return 1;
  else
    return fib(n-1)+fib(n-2);
}
int main()
{
  int term,f=0;
  std::cin>>term;
  f=fib(term-2);
  std::cout<<"The term "<<term<<" in the fibonacci series is "<<f;
  return 0;
}