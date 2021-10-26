// Hacker rank
#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long int n, m, s;
        cin >> n >> m >> s;
        long int warn = 0, rounds = 0;

        warn= (s+m-2)%n +1;
        cout << warn << endl;
     // rounds = m / n;

     // if (rounds == 0)
     // {
     //     warn = n / m;
     //     cout << (warn - 1) + s << endl;
     // }
     // else
     // {
     //     warn = m % n;
     //     cout << (warn - 1) + s << endl;
     // }
    }
    return 0;
}
