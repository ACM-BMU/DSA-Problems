#include <iostream>
using namespace std;

void towers(int, char, char, char);

void towers(int num, char mainpeg, char topeg, char auxpeg)
{
    if (num == 1)
    {
        cout << " Move disk 1 from peg " << mainpeg << " to peg " << topeg << endl;
        return;
    }
    towers(num - 1, mainpeg, auxpeg, topeg);
    cout << " Move disk " << num << " from peg " << mainpeg << " to peg " << topeg << endl;
    towers(num - 1, auxpeg, topeg, mainpeg);   
} 

int main()
{
    int num;
    cout << "Enter number of disks : ";
    cin >> num;
    cout << "The sequence of moves involved at Tower of Hanoi :\n" << endl;
    towers(num, 'A', 'B', 'C');
    
    cin.get();
    cin.get();
    return 0;
}