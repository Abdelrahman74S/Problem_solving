#include <iostream>
using namespace std;

int readnum(){
    cout<<"enter num \n";
    int n;cin>>n;

    return n;
}

void raedloopfornumber(){
    int num = readnum();
    for (int i=1;i<= num;i++){
        if(i % 2 != 0)
            cout<<"num : "<<i<<endl;
    }

}

int main(){
    raedloopfornumber();
}

/*

#include <iostream>

using namespace std;

enum enOddOrEven { Odd = 1, Even = 2 };

int ReadNumber() {

    int Number;

    cout << "Enter N : ";
    cin >> Number;

    return Number;
}

enOddOrEven CheckOddOrEven(int Number) {


    if (Number % 2 != 0)
    {
        return enOddOrEven::Odd;
    }

    else
    {
        return enOddOrEven::Even;
    }

}

int SumOddNumberFrom1ToN_UsingWhile(int N) {

    int Counter = 0;

    int Sum = 0;

    cout << "\nWhile\n";

    while (Counter < N)
    {
        Counter++;

        if (CheckOddOrEven(Counter) == enOddOrEven::Odd)
        {
            Sum += Counter;
        }

    }

    return Sum;
}

int SumOddNumberFrom1ToN_UsingDoWhile(int N) {

    int Counter = 0;

    int Sum = 0;

    cout << "\nDo..While\n";

    do
    {
        Counter++;

        if (CheckOddOrEven(Counter) == enOddOrEven::Odd)
        {
            Sum += Counter;
        }
    } while (Counter < N);


    return Sum;
}

int SumOddNumberFrom1ToN_UsingFor(int N) {

    cout << "\nFor\n";

    int Sum = 0;

    for (int Counter = 1; Counter <= N; Counter++)
    {

        if (CheckOddOrEven(Counter) == enOddOrEven::Odd)
        {
            Sum += Counter;
        }

    }

    return Sum;
}

void PrintResult(int Result)
{

    cout << Result;

}

int main()
{
    int N = ReadNumber();

    cout << SumOddNumberFrom1ToN_UsingFor(N);

    cout << SumOddNumberFrom1ToN_UsingWhile(N);

    cout << SumOddNumberFrom1ToN_UsingDoWhile(N);

    cout << "\n\n**********************\n";

    PrintResult(SumOddNumberFrom1ToN_UsingFor(N));

    PrintResult(SumOddNumberFrom1ToN_UsingWhile(N));

    PrintResult(SumOddNumberFrom1ToN_UsingDoWhile(N));
}*/