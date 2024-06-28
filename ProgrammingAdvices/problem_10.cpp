#include <iostream>
using namespace std;

void ReadNumbers(int& Number1, int& Number2, int& Number3) {

    cout << "Enter number1 : " << endl;
    cin >> Number1;

    cout << "Enter number2 : " << endl;
    cin >> Number2;

    cout << "Enter number3 : " << endl;
    cin >> Number3;
}

int CalculateSumOf3Number(int Number1, int Number2, int Number3) {
    return Number1 + Number2 + Number3;
}

float CalculateavgOf3Number(){
    int Number1, Number2, Number3;
  ReadNumbers(Number1, Number2, Number3);
int sum =CalculateSumOf3Number(Number1, Number2, Number3);

float avg = (float)sum /3;

return avg;
}
void PrintavgOfNumbers(float avg) {
    cout << "Total ave : " << avg << endl;
}

int main()
{

    PrintavgOfNumbers(CalculateavgOf3Number());
}