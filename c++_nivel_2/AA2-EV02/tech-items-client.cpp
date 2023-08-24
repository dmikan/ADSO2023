#include <iostream>
#include <vector>
#include <string>

class Cliente {
public:
    void crearLista() {
        int numProductos;
        std::cout << "Ingrese la cantidad de productos a agregar: ";
        std::cin >> numProductos;

        for (int i = 0; i < numProductos; ++i) {
            std::string producto;
            std::cout << "Ingrese el nombre del producto " << i + 1 << ": ";
            std::cin >> producto;
            listaCompras.push_back(producto);
        }

        mostrarLista();
    }

    void mostrarLista() {
        std::cout << "Lista de compras:\n";
        for (const std::string& producto : listaCompras) {
            std::cout << "- " << producto << "\n";
        }

        char respuesta;
        std::cout << "¿Está satisfecho con la lista? (S/N): ";
        std::cin >> respuesta;

        if (respuesta == 'S' || respuesta == 's') {
            std::cout << "¡Gracias por su compra!\n";
        } else {
            listaCompras.clear();
            crearLista();
        }
    }

private:
    std::vector<std::string> listaCompras;
};

int main() {
    Cliente cliente;
    cliente.crearLista();

    return 0;
}
