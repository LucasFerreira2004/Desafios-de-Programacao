#include <bits/stdc++.h>

using namespace std;
int solution(vector<int> &A);

int main(){
    vector<int> input = {1,4,-1,3,2};
    int res = solution(input);
    cout << res << endl;
    return 0;
}


int solution(vector<int> &A){
    int index = A[0];
    int countSize = 1;
    if (A[0] == -1)
        return countSize;

    while(A[index] != -1){
        countSize++;
        index = A[index];
    }
    return countSize + 1;
}
