#include <iostream>

using namespace std;

int main (){
    int n[1000];
    int t;
    
    cin >> t;

    for (int i, q = 0; i < 1000; i++, q++){
        n[i] = q;
        if (q + 1 == t) q = -1;
    }

    for (int i = 0; i < 1000; i++)
        cout << "N[" << i << "] = " << n[i]  << "\n";

    return 0;
}