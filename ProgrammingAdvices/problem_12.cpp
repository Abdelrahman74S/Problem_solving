#include <iostream>
using namespace std;

void readnum(int &a,int &b) {
    cout<<"enter two num\n";
    cin>>a>>b;
}

int maxnum(int a,int b) {
     if (a > b)
         return a;
     else
         return b;
}

void print(int x) {
    cout<<"max = "<<x<<endl;
}

int main() {
    int x,y;
    readnum(x,y);
    print(maxnum(x,y));
}


/*
#include <iostream>
#include <cmath>
using namespace std;

void ReadNumber(int& Number1, int& Number2) {

    cout << "Enter Number1 : " << endl;
    cin >> Number1;

    cout << "Enter Number2 : " << endl;
    cin >> Number2;
}

int MaxOf2Number(int Number1, int Number2) {
    return max(Number1, Number2);
   // if (Number1 > Number2)
        return Number1;
    else
        return Number2;//
}

void PrintNumber(int MaxNumber) {
    cout << MaxNumber;
}

int main()
{
    int Number1, Number2;
    ReadNumber(Number1, Number2);
    PrintNumber(MaxOf2Number(Number1, Number2));
}
*/