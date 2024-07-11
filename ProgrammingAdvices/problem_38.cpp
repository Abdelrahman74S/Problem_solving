#include <iostream>
using namespace std;

int readnum(){
 int n;cin>>n;
 return n;
}

void is_prime(){
 bool b =1;
 int x =readnum();

 bool isPrime = true;
 if (x <= 1) {
  isPrime = false;
 }
 else {
  for (int i = 2; i * i <= x; i++) {
   if (x % i == 0) {
    isPrime = false;
    break;
   }
  }
 }
 if (isPrime) {
  cout << "prime" << endl;
 } else {
  cout << "not prime" << endl;
 }
}

int main(){

 is_prime();

 return 0;
}
