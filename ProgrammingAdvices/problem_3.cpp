#include <iostream>
using namespace std;
/*
int Input() {
    int n;
    cin >> n;

    return n;
}

bool check(){
    int x =Input();

    if(x % 2 == 0) return 1;
    else return 0;

}

int main(){

 bool y = check();
  if(y == 1)  cout<<"even";
  if(y == 0)  cout<<"odd";

return 0;
}
*/

enum enNumberType { Odd = 1, Even = 2 };

int ReadNumbers() {
    int Number;

    cout << "enter a number : " << endl;
    cin >> Number;
    return Number;
}

enNumberType CheckNumberType(int Number) {
    int Result = Number % 2;
    if (Result == 0)
        return enNumberType::Even;
    else
        return enNumberType::Odd;
}

void PrintNumberType(enNumberType NumberType) {
    if (NumberType == enNumberType::Even)
        cout << "Number is even" << endl;
    else
        cout << "Number is Odd" << endl;
}

int main()
{
    PrintNumberType(CheckNumberType(ReadNumbers()));
}