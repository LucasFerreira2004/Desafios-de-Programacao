//Unfinished (já resolvi outro problema com RPN que eu considero mais dificil)
#include <iostream>
#include <string>
#include <map>
#include <stack>
#include <sstream>
#include <cmath>//?
#include <cctype> //

using namespace std;

#define atividade "05"
#define nome "Lucas Ferreira Nobre"
#define matricula "554590"
int prioridade (char ch){
    switch(ch){
        case '^': return 3;

        case '*': 
        case '/': return 2;

        case '+':
        case '-': return 1;

        case '(': return 0;
    }
    return -1;
}

string toRPN(string x)
{
  string rpn = "";
  stack<char> num;
  stack<char> oper;

  for (int i=0; i<x.length(); i++){
    char c = x[i];
    switch(c){
      case '^':
      case '*':
      case '/':
      case '+':
      case '-':
        while(!oper.empty() && prioridade(c) <= prioridade(oper.top())){
          char op2 = num.top(); num.pop();
          char c = oper.top(); oper.pop();
          char op1 = num.top(); num.pop();
          stringstream ss;
          ss << op1 <<  op2 << c;
          rpn += ss.str();
        }  
        oper.push(c);
        break;
      case '(':
        oper.push(c);
        break;
      case ')':
        while (oper.top() != '('){
          char op2 = num.top(); num.pop();
          char c = oper.top(); oper.pop();
          char op1 = num.top(); num.pop();
          stringstream ss;
          ss << op1 <<  op2 << c;
          rpn += ss.str();
        }
        oper.pop();
        break;
      default:
        num.push(c);
    }
  }

  while(!oper.empty()){
    char op2 = num.top(); num.pop();
    char c = oper.top(); oper.pop();
    char op1 = num.top(); num.pop();
    stringstream ss;
    ss << op1 <<  op2 << c;
    rpn += ss.str();
  }
  return rpn;
}

int main(){
    int n;
    cin >> n;
    while (n--){
        string s;
        cin >> s;
        cout << toRPN(s) << endl;
    }
    return 0; 
}
