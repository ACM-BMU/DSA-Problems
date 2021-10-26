#include <bits/stdc++.h>
using namespace std;

int main()
{


#ifndef ONLINE_JUDGE

    freopen("Input.txt", "r", stdin);

    freopen("Output.txt", "w", stdout);

#endif // ONLINE_JUDGE
    int t;
    cin >> t;

    while (t--)
    {
        int x, y;
        cin >> x >> y;
        int i, work=0;
        int arr[30];
        for (i = 0; i < 30; i++)
            cin >> arr[i];
        for (i = 0; i < 30; i++)
        {
            if (arr[i] == 1)
                work++;
        }
        int count=0, max = 0;
        for (i = 0; i < 30; ++i)
        {
            if (arr[i] == 1)
                count++;
            if (count >= max)
                max = count;
            if (arr[i] == 0)
                count = 0;
        }
        int pay;
        pay = (work * x) + (max * y);

        cout << pay << endl;
    }
}