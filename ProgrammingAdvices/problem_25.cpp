#include <iostream>
using namespace std;
/*
int ReadAge() {
    int Age;
    cout << "Enter your Age : "<<endl;
    cin >> Age;

    return Age;
}

bool ValidateNumberInRange(int Number, int From, int To) {
    return (Number >= From && Number <= To);
}

void PrintResult(int Age) {
bool x =1;
for(int i = 18;i<=45;i++){
    if (ValidateNumberInRange(Age, 18, 45))
     x =1;
    else
     x = 0;
    }

    if(x) cout << Age << " is a valid age\n";
    else  cout << Age << " is invalid age\n";
}

int main()
{   for(int i = 1;i<=10;i++)
    PrintResult(ReadAge());

    return 0;
}

*/


int ReadAge() {
    int Age;
    cout << "Enter your Age Between 18 and 45 : ";
    cin >> Age;

    return Age;
}


bool ValidateNumberInRange(int Number, int From, int To) {
    return (Number >= From && Number <= To);
}


int ReadUntilAgeBetween(int From, int To) {
    int Age = 0;

    do
    {
        Age = ReadAge();
    } while (!ValidateNumberInRange(Age, From,  To));

    return Age;
}

void PrintResult(int Age) {
    if (ValidateNumberInRange(Age, 18, 45))
        cout << Age << " is a valid age\n";
    else
        cout << Age << " is invalid age\n";
}

int main()
{
    PrintResult(ReadUntilAgeBetween(18,45));

    return 0;
}
