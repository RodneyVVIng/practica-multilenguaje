#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>

using namespace std;

bool esPalindromo(string texto) {
    texto.erase(remove_if(texto.begin(), texto.end(), ::isspace), texto.end());
    transform(texto.begin(), texto.end(), texto.begin(), ::tolower);
    
    int izquierda = 0;
    int derecha = texto.length() - 1;
    
    while (izquierda < derecha) {
        if (texto[izquierda] != texto[derecha]) {
            return false;
        }
        izquierda++;
        derecha--;
    }
    return true;
}

int main() {
    string entrada;
    
    cout << "Ingrese una palabra o frase para verificar si es palindromo:" << endl;
    getline(cin, entrada);
    
    if (esPalindromo(entrada)) {
        cout << "'" << entrada << "' es un palindromo." << endl;
    } else {
        cout << "'" << entrada << "' no es un palindromo." << endl;
    }
    
    return 0;
}