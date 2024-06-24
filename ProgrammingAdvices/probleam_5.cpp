#include <iostream>
#include <string>
using namespace std;

enum driver {
    agedrive = 21, lens = true ,cheat = true
};

driver readage() {
    driver op;
    cout << "Enter your age: " << endl;
    int c;cin>>c;
    op =(driver)c;
    return op;
}

driver readlens() {
    driver len;
    cout << "Do you have DrivingLicense(Yes = 1,No = 0) ? " << endl;
    bool s;cin>>s;
    len = (driver)s;
    return len;
}

driver readcheat() {
    driver ch;
    cout << "Do you have cheat(Yes = 1,No = 0) ? " << endl;
    bool h;cin>>h;
    ch = (driver)h;
    return  ch;
}

void print(driver op1, driver op2, driver op3) {
    if(op3 == driver::cheat) {
        cout << "Hired\n";
        return;
    }

    if(op1 >= driver::agedrive && op2 == driver::lens)
            cout << "Hired\n";
        else
            cout << "Rejected\n";
}
int main() {
    driver age = readage(),lenscar = readlens(),ch =readcheat();

    print(age,lenscar,ch);
    return 0;
}

/*struct stInfo
{
    int Age;
    bool HasDrivingLicense;
    bool HasRecommendation;
};

stInfo ReadInfo() {
    stInfo Info;

    cout << "Enter your age: " << endl;
    cin >> Info.Age;

    cout << "Do you have DrivingLicense ? " << endl;
    cin >> Info.HasDrivingLicense;

    cout << "Do you have Recommendation ? " << endl;
    cin >> Info.HasRecommendation;

    return Info;
}

bool IsAccepted(stInfo Info) {
    if (Info.HasRecommendation)
        return true;
    else
        return (Info.Age > 21 && Info.HasDrivingLicense);
}

void PrintResult(stInfo Info) {
    if (IsAccepted(Info))
        cout << "Hired";
    else
        cout << "Rejected";
}

int main()
{
    PrintResult(ReadInfo());

    return 0;
}*/