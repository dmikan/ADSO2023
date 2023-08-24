#include <iostream>

const double PI = 3.14159265;  // Variable global para el valor de PI

double calcularAreaRectangulo(double base, double altura) {
    return base * altura;
}

double calcularPerimetroRectangulo(double base, double altura) {
    return 2 * (base + altura);
}

double calcularAreaCirculo(double radio) {
    return PI * radio * radio;
}

double calcularPerimetroCirculo(double radio) {
    return 2 * PI * radio;
}

// Agregar funciones para más figuras geométricas

void mostrarResultado(double area, double perimetro) {
    std::cout << "Área: " << area << "\n";
    std::cout << "Perímetro: " << perimetro << "\n";
}

int main() {
    double area, perimetro;

    // Cálculos para un rectángulo
    area = calcularAreaRectangulo(5.0, 3.0);
    perimetro = calcularPerimetroRectangulo(5.0, 3.0);
    std::cout << "Rectángulo:\n";
    mostrarResultado(area, perimetro);

    // Cálculos para un círculo
    area = calcularAreaCirculo(2.0);
    perimetro = calcularPerimetroCirculo(2.0);
    std::cout << "\nCírculo:\n";
    mostrarResultado(area, perimetro);

    // Agregar más cálculos para otras figuras geométricas

    return 0;
}
