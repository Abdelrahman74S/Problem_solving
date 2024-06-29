#include <iostream>
#include <cmath>
using namespace std;

#define pi 3.14159

void readnum(double& a, double& b,double& c) {
    cout << "Enter num\n";
    cin >> a >> b >> c;
}

double area(double a, double b,double c) {
    double p =(a+b+c)/2,
     x =a*b*c,
    y= p*(p-a)*(p-b)*(p-c),
    z = x/(4*sqrt(y));

    return  (pi * (z * z)) ;
}

void printarea() {
    double x,y,z ;
    readnum(x,y,z);
    cout << "area =" << area(x,y,z) << endl;
}

int main() {
    printarea();
    return 0;
}

/*

#include <iostream>
#include <cmath>
using namespace std;



void ReadNumbers(float& A, float& B, float& C) {
    cout << "Enter A : ";
    cin >> A;

    cout << "Enter B : ";
    cin >> B;

    cout << "Enter C : ";
    cin >> C;
}

float CircleAreaByArbitraryTriangle(float A, float B, float C) {
    const float PI = 3.14159;

    float P = (A + B + C) / 2;

    float Area = PI * pow(((A * B * C) / (4 * sqrt(P * (P - A) * (P - B) * (P - C)))), 2);

    return Area;
}

void PrintResult(float Area) {
    cout << "Area = " << Area << endl;
}

int main()
{
    float A, B, C;
    ReadNumbers(A, B, C);
    PrintResult(CircleAreaByArbitraryTriangle(A, B, C));
}
*/