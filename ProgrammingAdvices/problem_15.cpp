#include <iostream>
using namespace std;

void readnum(float &a,float &b) {
    cout<<"enter two num\n";
    cin>>a>>b;
}

float area(float a,float b){
 return a*b;
}

void print(float x){
    cout<<"Area = "<<x<<endl;
}

int main(){
   float x,y;
    readnum(x,y);
    print(area(x,y));
}

/*
#include <iostream>
using namespace std;

void ReadNumbers(float& Number1, float& Number2) {
    cout << "enter number1" << endl;
    cin >> Number1;
    cout << "enter number1" << endl;
    cin >> Number2;
}

float AreaOfRectangle(float Number1, float Number2) {
    return Number1 * Number2;
}

void PrintArea(float Area) {
    cout << "Area of rectangle : " << Area << endl;
}

int main()
{
    float Number1, Number2;
    ReadNumbers(Number1, Number2);
    PrintArea(AreaOfRectangle(Number1, Number2));
}
*/