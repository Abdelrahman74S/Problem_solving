#include <iostream>
#include <cmath>
using namespace std;

void readnum(float& a, float& d) {
    cout << "Enter num\n";
    cin >> a >> d;
}

float area(float a, float d) {
    return (a * sqrt((d * d) - (a * a)));
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
#include <cmath>
using namespace std;

void ReadNumbers(int& A, int& D) {

    cout << "Enter A" << endl;
    cin >> a;

    cout << "Enter D" << endl;
    cin >> d;

}

float RectangleAreaBySideAndDiagonal(int A, int D) {

    return A * sqrt(pow(D, 2) - pow(A, 2));

}

void PrintResult(float Area) {
    cout << Area << endl;
}

int main()
{
    int A, D;
    ReadNumbers(A, D);
    PrintResult(RectangleAreaBySideAndDiagonal(A, D));
}
*/