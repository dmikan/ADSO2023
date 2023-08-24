//Aplicación de Arreglos como Parámetros
#include <iostream>

void ingresarArreglo(int arreglo[], int n) {
    std::cout << "Ingrese " << n << " elementos al arreglo:\n";
    for (int i = 0; i < n; ++i) {
        std::cout << "Elemento " << i + 1 << ": ";
        std::cin >> arreglo[i];
    }
}

void mostrarArreglo(int arreglo[], int n) {
    std::cout << "Arreglo ingresado:\n";
    for (int i = 0; i < n; ++i) {
        std::cout << arreglo[i] << " ";
    }
    std::cout << std::endl;
}

void elevarAlCubo(int arreglo[], int n) {
    for (int i = 0; i < n; ++i) {
        arreglo[i] = arreglo[i] * arreglo[i] * arreglo[i];
    }
}

int main() {
    int n;
    std::cout << "Ingrese la cantidad de elementos para el arreglo: ";
    std::cin >> n;

    int arreglo[n];
    ingresarArreglo(arreglo, n);
    mostrarArreglo(arreglo, n);

    elevarAlCubo(arreglo, n);
    std::cout << "Arreglo elevado al cubo:\n";
    mostrarArreglo(arreglo, n);

    return 0;
}
