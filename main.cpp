#include <iostream>
using namespace std;

void tim(int, int);

int main()
{
	int hour, min;

	cout << "Enter the number of hours: " << endl;
	cin >> hour;
	cout << "Enter the number of minutes: " << endl;
	cin >> min;
	
	tim(hour, min);

	cin.get();
	return 0;
}
void tim(int h, int m)
{
	cout<<"Time: "<<h<<":"<<m<<endl;

}