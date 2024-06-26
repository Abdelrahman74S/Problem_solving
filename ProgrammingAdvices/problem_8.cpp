#include <iostream>
using namespace std;
/*
float raednum(){
cout<<"enter num\n";
 float n;cin>>n;

  return n;
}

bool ispass(){
  float n = raednum();
  if(n >= 50) return 1;
  else return 0;
}

void print(){
  bool s = ispass();
   if(s)
   cout<<"pass\n";
   else
   cout<<"fail\n";
}


int main(){
   print();
   return 0;
}
*/

enum enpf {pass =1 ,fail =0};

float raednum(){
    cout<<"enter num\n";
    float n;cin>>n;

    return n;
}

enpf ispass() {
    float n = raednum();
    if(n >= 50) return enpf::pass;
    else return enpf::fail;
}


void print(){

    if( ispass() == enpf::pass)
        cout<<"pass\n";
    else
        cout<<"fail\n";
}

int main(){
    print();
    return 0;
}


















