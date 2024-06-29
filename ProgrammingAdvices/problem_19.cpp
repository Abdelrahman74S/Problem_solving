#include <iostream>
#include <cmath>
using namespace std;

#define pi 3.14

void readnum(float& d) {
    cout << "Enter num\n";
    cin >> d;
}

float area(float d) {
    return ( (d * d * pi) /4);
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

float ReadDiameter() {
    float D;
    cout << "Enter diameter : " << endl;
    cin >> D;
    return D;
}

float CalculateCircleAreaByDiameter(float D) {
    const float PI = 3.14159;
    float Area = (PI * pow(D, 2)) / 4;
    return Area;
}

void PrintResult(float Area) {
    cout << "Circle Area = " << Area << endl;
}

int main()
{
    PrintResult(CalculateCircleAreaByDiameter(ReadDiameter()));
}
*/