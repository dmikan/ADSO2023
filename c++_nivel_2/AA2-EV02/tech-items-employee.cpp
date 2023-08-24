#include <iostream>
#include <vector>

class Empleado {
public:
    void calcularVentas() {
        int numProductos;
        std::cout << "Ingrese la cantidad de productos a calcular: ";
        std::cin >> numProductos;

        for (int i = 0; i < numProductos; ++i) {
            double cantidad, valorUnitario, descuento;
            std::cout << "Producto " << i + 1 << ":\n";
            std::cout << "Cantidad: ";
            std::cin >> cantidad;
            std::cout << "Valor unitario: ";
            std::cin >> valorUnitario;
            std::cout << "Descuento (%): ";
            std::cin >> descuento;

            productos.push_back({ cantidad, valorUnitario, descuento });
        }

        mostrarInformacion();
    }

    void mostrarInformacion() {
        std::cout << "Información de productos:\n";
        for (const Producto& producto : productos) {
            double valorTotal = producto.cantidad * producto.valorUnitario * (1.0 - producto.descuento / 100.0);
            std::cout << "Cantidad: " << producto.cantidad << "\n";
            std::cout << "Valor unitario: " << producto.valorUnitario << "\n";
            std::cout << "Descuento: " << producto.descuento << "%\n";
            std::cout << "Valor total: " << valorTotal << "\n";
        }

        char opcion;
        std::cout << "Seleccione una opción:\n";
        std::cout << "1. Calcular valor total\n";
        std::cout << "2. Generar nueva lista\n";
        std::cin >> opcion;

        if (opcion == '1') {
            calcularVentas();
        } else if (opcion == '2') {
            productos.clear();
            calcularVentas();
        }
    }

private:
    struct Producto {
        double cantidad;
        double valorUnitario;
        double descuento;
    };

    std::vector<Producto> productos;
};

int main() {
    Empleado empleado;
    empleado.calcularVentas();

    return 0;
}
