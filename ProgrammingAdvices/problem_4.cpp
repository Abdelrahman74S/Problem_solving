#include <iostream>
#include <string>
using namespace std;

enum driver {
    agedrive = 21, lens = true
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

void print(driver op1,driver op2) {
  if(op1 >= driver::agedrive && op2 == driver::lens)
      cout<<"Hired\n";
  else
      cout<<"Rejected\n";
}

int main() {
    driver age = readage(),lenscar = readlens();

    print(age,lenscar);
return 0;
}





/*
struct stInfo
{
    int Age;
    bool HasDrivingLicense;
};

stInfo ReadInfo() {
    stInfo Info;

    cout << "Enter your age: " << endl;
    cin >> Info.Age;

    cout << "Do you have DrivingLicense ? " << endl;
    cin >> Info.HasDrivingLicense;

    return Info;
}

bool IsAccepted(stInfo Info) {
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
}
// unit testing تجربة كل الأخطاء
*/