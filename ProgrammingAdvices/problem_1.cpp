#include <iostream>
using namespace std;

string nme(){
    string a;
    getline (cin,a);

    return a;
}
void print(){
    string s = nme();
    cout<<"my name is "<<s<<endl;
}

int main(){

    print();
}