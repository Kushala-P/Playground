#include<iostream>
using namespace std;
int main()
{
  int famt=1000,fdis=50,fship=50,samt=900,sdis=50,sship=70,aamt=800,adis=10,aship=200,fd=0,sd=0,ad=0,ftot=0,stot=0,atot=0;
  cin>>famt>>fdis>>fship>>samt>>sdis>>sship>>aamt>>adis>>aship;
  fd=fdis*famt/100;
  ftot=famt-fd+fship;
  sd=sdis*samt/100;
  stot=samt-sd+sship;
  ad=adis*aamt/100;
  atot=aamt-ad+aship;
  cout<<"In Flipkart Rs."<<ftot<<"\n";
  cout<<"In Snapdeal Rs."<<stot<<"\n";
  cout<<"In Amazon Rs."<<atot<<"\n";
  if(ftot<stot&&ftot<atot)
    cout<<"He will prefer Flipkart";
  else if(stot<ftot&&stot<atot)
    cout<<"He will prefer Snapdeal";
  else if(atot<ftot&&atot<stot)
    cout<<"He will prefer Amazon";
  else if(ftot==stot)
    cout<<"He will prefer Flipkart";
  else if(stot==atot)
    cout<<"He will prefer Snapdeal";
  else if(atot==ftot)
  	cout<<"He will prefer Amazon";
  
}