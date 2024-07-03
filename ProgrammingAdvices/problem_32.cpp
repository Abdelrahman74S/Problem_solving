#include <iostream>
using namespace std;

int i=0;

void readnum(int &m,int &n){
    cout<<"input number: "<<"\n";
    cin>>m>>n;

}

int power(int m,int n){
    if(m==0)
        return 1;

    int pw=1;
    for(;i<m;i++){
        pw *=n;
    }
    return pw;
}



void print(){
    int x,y;
    readnum(x,y);
    cout<<"power: "<<power(x,y)<<endl;
}

int main(){
    print();
}

/*

int ReadNumber()
{

    int Number;

    cout << "Enter Number : ";
    cin >> Number;

    return Number;

}

int ReadPower()
{

    int M;

    cout << "Enter Power : ";
    cin >> M;

    return M;

}

int PowerOfM(int Number, int M)
{

    if (M == 0)
        return 1;

    int P = 1;

    for (int i = 1; i <= M; i++)
    {
        P *= Number;
    }

    return P;
}

int main()
{
    cout << PowerOfM(ReadNumber(), ReadPower());

    cout << "\n";

    int N = ReadNumber();
    int P = ReadPower();

    cout << PowerOfM(N, P);

}

 */