#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    long sum=0;
    cin>>n;
    long a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        sum=sum+a[i];
    }
    cout<<sum;
    return 0;
}
