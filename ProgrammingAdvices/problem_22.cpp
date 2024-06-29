#include <iostream>
#include <cmath>
using namespace std;

#define pi 3.14159

void readnum(float& a, float& b) {
    cout << "Enter num\n";
    cin >> a >> b;
}

float area(float a, float b) {
    return (pi * ((b*b)/4) * ((2 * a - b) / (2 * a + b)) ) ;
}

void printarea() {
    float x,y;
    readnum(x,y);
    cout << "area =" << area(x,y) << endl;
}

int main() {
    printarea();
    return 0;
}

/*

#include <iostream>
#include <cmath>
using namespace std;

void ReadTriangleData(float& A, float& B) {
    cout << "Enter A : ";
    cin >> A;

    cout << "Enter B : ";
    cin >> B;
}

float CircleAreaByIsoscelesTriangle(float A, float B) {
    const float PI = 3.14159;
    float Area = PI * (pow(B, 2) / 4) * ((2 * A - B) / (2 * A + B));
    return Area;
}

void PrintResult(float Area) {
    cout << "Circle Area = " << Area;
}

int main()
{
    float A, B;
    ReadTriangleData(A, B);
    PrintResult(CircleAreaByIsoscelesTriangle(A, B));
}
*/