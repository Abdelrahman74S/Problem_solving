#include <iostream>
#include <cmath>
using namespace std;

#define pi 3.14

void readnum(float& r) {
    cout << "Enter num\n";
    cin >> r;
}

float area(float r) {
    return ( r * r * pi);
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

float ReadRadius() {
    float R;
    cout << "Enter Radius : " << endl;
    cin >> R;
    return R;
}

float CalculateCircleArea(float R) {
    const float PI = 3.14159265;
    float Area = PI * pow(R, 2);
    return Area;
}

void PrintResult(float Area) {
    cout << Area << endl;
}

int main()
{
    PrintResult(CalculateCircleArea(ReadRadius()));
}
*/