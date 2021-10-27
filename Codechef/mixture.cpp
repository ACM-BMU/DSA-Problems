#include <bits/stdc++.h>
using namespace std;
int main()
{
#ifndef ONLINE_JUDGE

    freopen("input.txt", "r", stdin);


    freopen("output.txt", "w", stdout);
#endif // ONLINE_JUDGE

    int t;
    cin >> t;
    while (t--)
    {
        int x, y, z, d, count = 0;
        cin >> x >> y >> z >> d;
        if (x + y + z <= d) {
            count = 1;
        }

        else if ((x + y + z > d) && ( (x + y) || (y + z) || (x + z) <= d)) {
            count = 2;
        }

        else {
            count = 3;
        }
        cout << count << endl;
    }
}


