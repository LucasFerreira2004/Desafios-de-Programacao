#include <iostream>
#include <stack>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    stack <int> pilha;
    queue <int> fila;
    //vector <int> vet (10, 0); // todas as posições estão zeradas graças a esse 0, mas ele é opcional e pode ser qualquer outro valor
    vector <int> vet;
    
    pilha.push(4);
    pilha.push(3);
    pilha.push(2);
    pilha.push(1);
    
    fila.push(4);
    fila.push(3);
    fila.push(2);
    fila.push(1);
    /*
    while(!pilha.empty()){
        cout << pilha.top() << '\n';
        pilha.pop();
        // tá dando um errinho mas dá pra entender a lógica
    }
    
   while(!fila.empty()){
        cout << fila.front() << '\n';
        fila.pop();
        // tá dando um errinho mas dá pra entender a lógica
    }
    

   for (int i = 0; i < (int) vet.size(); ++i){
    cout << vet[i] << '\n';
   }
   */
  for (int i = 0; i < 10; i++){
    int a;
    cin >> a;
    vet.push_back(a);
  }
    sort(vet.begin(), vet.end());
  //for each - serve para que possamos escrever menos
  for (int i : vet){
    cout << i << '\n';      
  }
    return 0;
}