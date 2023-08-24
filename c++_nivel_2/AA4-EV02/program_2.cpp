//Aplicación de Parámetros por Referencia.
#include <iostream>

void calcularSalarioSiguienteAnio(double &salarioActual, int antiguedad) {
    if (antiguedad >= 0 && antiguedad <= 5) {
        salarioActual *= 1.06;
    } else if (antiguedad > 5 && antiguedad <= 10) {
        salarioActual *= 1.08;
    } else if (antiguedad > 10) {
        salarioActual *= 1.10;
    }
}

int main() {
    double salarioActual;
    int antiguedad;

    std::cout << "Ingrese el salario anual actual: ";
    std::cin >> salarioActual;
    std::cout << "Ingrese la antigüedad en años: ";
    std::cin >> antiguedad;

    std::cout << "Salario actual: $" << salarioActual << std::endl;

    calcularSalarioSiguienteAnio(salarioActual, antiguedad);
    std::cout << "Salario siguiente año: $" << salarioActual << std::endl;

    return 0;
}
