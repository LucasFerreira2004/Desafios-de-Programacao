#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    vector<int> descendentes(N);
    for (int i = 0; i < N; i++) {
        cin >> descendentes[i];
    }

    vector<int> participantes(M);
    for (int i = 0; i < M; i++) {
        cin >> participantes[i];
    }

    vector<vector<int>> geracoes;
    geracoes.push_back(participantes);

    for (int i = 0; i < N; i++) {
        vector<int> geracao_atual;
        for (int j : geracoes[i]) {
            if (descendentes[j-1] != 0) {
                geracao_atual.push_back(descendentes[j-1]);
            }
        }
        geracoes.push_back(geracao_atual);
    }

    vector<double> porcentagens;
    for (int i = 0; i < geracoes.size(); i++) {
        double porcentagem = geracoes[i].size() * 100.0 / geracoes[i-1].size();
        porcentagens.push_back(porcentagem);
    }

    cout << fixed << setprecision(2);
    for (double porcentagem : porcentagens) {
        cout << porcentagem << " ";
    }
    cout << endl;

    return 0;
}
