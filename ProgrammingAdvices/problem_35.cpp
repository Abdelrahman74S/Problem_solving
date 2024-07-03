#include <iostream>
using namespace std;

void num(){
cout<<"enter number"<<endl;
}

int penny(){

int pe;cin>>pe;

return pe;

}

int nickel(){

int ni;cin>>ni;

return ni * 5;
}

int dime(){

    int di;cin>>di;

    return di * 10;
}

int quarter(){

    int qu;cin>>qu;

    return qu * 25;
}

int dollar(){

    int DO;cin>>DO;

    return DO * 100;
}

void print(){
int p = penny(),ni = nickel(),di = dime(), qu =quarter(), d = dollar(),
total_peeny= p +ni+di+qu+d;
float total_dollar = (float)total_peeny / 100;

cout<<"total peeny: "<<total_peeny<<endl;
cout<<"total $: "<<total_dollar<<endl;
}

int main(){
num();
print();
}