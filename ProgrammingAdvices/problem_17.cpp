#include <iostream>
#include <cmath>
using namespace std;

void readnum(float& a, float& h) {
    cout << "Enter num\n";
    cin >> a >> h;
}

float area(float a, float h) {
    return (.5 * a * h);
}

void printarea() {
    float x, y;
    readnum(x, y);
    cout << "area =" << area(x, y) << endl;
}

int main() {
    printarea();
    return 0;
}

/*
#include <iostream>
using namespace std;

void ReadNumbers(int& A, int& H) {

    cout << "Enter A : " << endl;
    cin >> A;

    cout << "Enter H : " << endl;
    cin >> H;

}

float CalculateTriangleArea(int A, int H) {
    return (A / 2) * H;
}

void PrintResult(int Area) {
    cout << Area;
}

int main()
{
    int A, H;
    ReadNumbers(A, H);
    PrintResult(CalculateTriangleArea(A, H));
}
*/