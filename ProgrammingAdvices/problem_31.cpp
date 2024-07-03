#include <iostream>
using namespace std;

int readnum(){
 cout<<"input number: "<<"\n";
 int n;cin>>n;
return n;
}

int power2(int n){
 return n*n;
}

int power3(int n){
 return n*n*n;
}

int power4(int n){
 return n*n*n*n;
}

void print(){
  int pw = readnum();
  cout<<"power(2): "<<power2(pw)<<endl;
  cout<<"power(3): "<<power3(pw)<<endl;
  cout<<"power(4): "<<power4(pw)<<endl;

}

int main(){
print();
}

/*

#include <iostream>

using namespace std;

int ReadNumber()
{

 int Number;

 cout << "Enter Number : ";
 cin >> Number;

 return Number;

}

void PrintPowerOf2_3_4(int Number)
{

 cout << Number * Number << endl;
 cout << Number * Number * Number << endl;
 cout << Number * Number * Number * Number << endl;

}


int main()
{
 PrintPowerOf2_3_4(ReadNumber());
}

 */