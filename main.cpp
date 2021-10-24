#include <iostream>
using namespace std;

int exp(int x, int y) // exponential func gives x^y
{
    int a = x;

    for (int i = 1; i < y; i++)
    {
        x = x * a;
    }

    return x;
}

void notg(bool& x) // converts 0 to 1, 1 to 0
{
    x = 1 - x;
}

void switchpress(bool* arr, int size, int switches) // yeto ajaega smjh
{
    if (switches == 1) {
        notg(arr[0]);
        notg(arr[1]);
    }

    else if (switches == size) {
        notg(arr[size - 1]);
        notg(arr[size - 2]);
    }

    else {
        notg(arr[switches - 2]);
        notg(arr[switches - 1]);
        notg(arr[switches]);
    }
}

bool isarrequal(bool* arr1, bool* arr2, int size)   // function to check if arrays are equal
{
    for (int i = 0; i < size; i++)
    {
        if (arr1[i] != arr2[i])
            return 0;
    }

    return 1;
}

bool isarrequal(int* arr1, int* arr2, int size) // same as above but for int
{
    for (int i = 0; i < size; i++)
    {
        if (arr1[i] != arr2[i])
            return 0;
    }

    return 1;
}

void makearrequal(bool* arr1, bool* arr2, int size) // actually makes array equal
{
    for (int i = 0; i < size; i++)
        arr1[i] = arr2[i];
}

void makearrequal(int* arr1, int* arr2, int size)   // same but with int
{
    for (int i = 0; i < size; i++)
        arr1[i] = arr2[i];
}

bool solver(bool* arr1, bool* arr2, int* switches, int size)
{
    bool dupl[size];    // duplicate of initial array for restoring it to original after its value modifies

    makearrequal(dupl, arr1, size);

    for (int k = 1; k < exp(2, 2 * size); k++)     // function runs n square times where n is all the combinations possible
    {
        makearrequal(arr1, dupl, size);

        int n = rand() % size + 1;              // assigns a random value lesser than size of the array

        int incld[n];

        for (int i = 0; i < size; i++)
            switches[i] = 0;                // resets switches array to 0

        for (int i = 0; i < n; i++)
        {
            incld[i] = rand() % size + 1;     // assigns a random value lesser than size of array

            for (int j = 0; j < i; j++)
            {
                if (incld[j] == incld[i])      // if value repeats it keeps getting assigned new random value until it doesn't repeat
                {
                    incld[i] = rand() % size + 1;
                    j = -1;
                }
            }

            switchpress(arr1, size, incld[i]);  // presses the switches given by random values
        }

        if (isarrequal(arr1, arr2, size) == 1)   // if the switches satisfies the solution then store those random values into switches array else assign new random values
        {
            makearrequal(switches, incld, n);
            return 1;       // thus function returns true that there is indeed a solution
        }
    }

    return 0;       // if after so many tries theres no solution found then it returns false
}

int main()
{
    int size;
    cout << "Linear Algebra 2021 Project \nGroup 3 Project #4 \nFinite Linear Games \n\n\n\n\n\n";
    cout << "Please enter the number of bulbs \n";
    cin >> size;

    bool initial[size], final[size];

    int switches[size];

    cout << "\n\n\nPlease enter the initial state of bulbs \n";

    for (int i = 0; i < size; i++)
        cin >> initial[i];

    cout << "\n\n\nPlease enter the final state of bulbs \n";

    for (int i = 0; i < size; i++)
        cin >> final[i];

    if (solver(initial, final, switches, size) == 0)       // if solver returns false then there is no solution otherwise solution is printed
        cout << "No solutions found \n";

    else
    {
        cout << "The switches required are \n";

        for (int i = 0; switches[i] != 0; i++)
            cout << char(switches[i] + 64) << " ";
    }

    return 0;
}