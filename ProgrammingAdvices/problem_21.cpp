#include <iostream>
#include <cmath>
using namespace std;

#define pi 3.14159

void readnum(float& l) {
    cout << "Enter num\n";
    cin >> l;
}

float area(float l) {
    return ( (l * l ) /(4 * pi));
}

void printarea() {
    float x;
    readnum(x);
    cout << "area =" << area(x) << endl;
}

int main() {
    printarea();
    return 0;
}

/*

#include <iostream>
#include <cmath>
using namespace std;

float ReadCircumference() {
    float L;
    cout << "Enter L : ";
    cin >> L;
    return L;
}

float CircleAreaByCircumference(float L) {
    const float PI = 3.14159;
    float Area = (pow(L, 2) / (4 * PI));
    return Area;
}

void PrintResult(float Area) {
    cout << "Circle Area = " << Area << endl;
}

int main()
{
    PrintResult(CircleAreaByCircumference(ReadCircumference()));
}
*/