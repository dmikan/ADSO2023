//Aplicación de Parámetros por Valor
#include <iostream>

double calcularCostoEnvio(double peso) {
    if (peso <= 10) {
        return 28000;
    } else if (peso <= 30) {
        return 34000 + 1600 * (peso - 10);
    } else if (peso >= 50) {
        return 60000 + 1900 * (peso - 50);
    } else {
        return 0;
    }
}

int main() {
    double peso;
    std::cout << "Ingrese el peso del paquete en kilogramos: ";
    std::cin >> peso;

    double costoEnvio = calcularCostoEnvio(peso);
    std::cout << "El costo total del envío es: $" << costoEnvio << std::endl;

    return 0;
}
