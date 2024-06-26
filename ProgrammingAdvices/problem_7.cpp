#include <iostream>
#include <string>
using namespace std;
/*
int raednum() {
    cout<<"enter num\n";
    int n;cin>>n;
    return n;
}

float half(int num) {
    float s = (float) num / 2;
    return s;
}

void printnum(float f) {
cout<<f<<endl;
}

int main() {
    printnum(half(raednum()));
}

*/

int ReadNumber()
{
    int Number;

    cout << "enter a number : " << endl;
    cin >> Number;
    return Number;
}

float CalculateHalfNumber(int Number) {
    return (float)Number / 2;
}

void PrintHalfNumber(int Number) {
    string Result = "Half of " + to_string(Number) + " is " + to_string(CalculateHalfNumber(Number));
    cout << Result << endl;
}

int main()
{
    PrintHalfNumber(ReadNumber());

    return 0;
}