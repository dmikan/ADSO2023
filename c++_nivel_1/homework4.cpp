#include <iostream>
#include <cctype>

int main() {
    char registro = 's';
    int referencia;
    float talla, costo;
    char descripcion[100];

    while (registro == 's' || registro == 'S') {
        std::cout << std::endl << "Desea registrar otros zapatos (escriba S para sí o N para no) : ";
        std::cin >> registro;

        if (registro == 's' || registro == 'S') {
            bool referenciaValida = false;
            while (!referenciaValida) {
                std::cout << "Digite la referencia de los zapatos: ";
                if (std::cin >> referencia) {
                    referenciaValida = true;
                } else {
                    std::cout << "Error: Debe ingresar solo números para la referencia." << std::endl;
                    std::cin.clear();
                    while (std::cin.get() != '\n');
                }
            }

            std::cout << "Digite una descripción del zapato: ";
            std::cin.ignore();
            std::cin.getline(descripcion, 100);

            bool tallaValida = false;
            while (!tallaValida) {
                std::cout << "Digite la talla : ";
                if (std::cin >> talla) {
                    tallaValida = true;
                } else {
                    std::cout << "Error: Debe ingresar solo números para la talla." << std::endl;
                    std::cin.clear();
                    while (std::cin.get() != '\n');
                }
            }

            bool costoValido = false;
            while (!costoValido) {
                std::cout << "Digita el costo del zapato: ";
                if (std::cin >> costo) {
                    costoValido = true;
                } else {
                    std::cout << "Error: Debe ingresar solo números para el costo." << std::endl;
                    std::cin.clear();
                    while (std::cin.get() != '\n');
                }
            }
        }
    }

    std::cout << "FIN DE LA APLICACIÓN" << std::endl;

    return 0;
}
