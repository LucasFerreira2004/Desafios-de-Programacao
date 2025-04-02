#include <iostream>

using namespace std;

int main (){
    int n[20];

    for (int i = 0; i < 20; i++)
        cin >> n[i];
    

    for (int i = 0, k = 19; i < k; i++, k--){
        int temp = n[i];
        n[i] = n[k];
        n[k] = temp;
    }

    for (int i = 0; i < 20; i++)
        cout << "N[" << i << "] = " << n[i]  << "\n";

    return 0;
}