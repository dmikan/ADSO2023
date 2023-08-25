#include <iostream>
#include <string>

// Clase base Animal
class Animal {
public:
    Animal(std::string especie) : especie(especie) {}

    virtual void mostrarCaracteristicas() const {
        std::cout << "Especie: " << especie << std::endl;
    }

private:
    std::string especie;
};

// Clase Mamifero
class Mamifero : public Animal {
public:
    Mamifero(std::string especie, std::string colorPelo, int cantidadDientes)
        : Animal(especie), colorPelo(colorPelo), cantidadDientes(cantidadDientes) {}

    void mostrarCaracteristicas() const override {
        Animal::mostrarCaracteristicas();
        std::cout << "Color de Pelo: " << colorPelo << std::endl;
        std::cout << "Cantidad de Dientes: " << cantidadDientes << std::endl;
    }

private:
    std::string colorPelo;
    int cantidadDientes;
};

// Clase Ave
class Ave : public Animal {
public:
    Ave(std::string especie, std::string tipoAlas, bool tienePlumas)
        : Animal(especie), tipoAlas(tipoAlas), tienePlumas(tienePlumas) {}

    void mostrarCaracteristicas() const override {
        Animal::mostrarCaracteristicas();
        std::cout << "Tipo de Alas: " << tipoAlas << std::endl;
        std::cout << "Tiene Plumas: " << (tienePlumas ? "Sí" : "No") << std::endl;
    }

private:
    std::string tipoAlas;
    bool tienePlumas;
};

// Clase Reptil
class Reptil : public Animal {
public:
    Reptil(std::string especie, std::string colorEscamas)
        : Animal(especie), colorEscamas(colorEscamas) {}

    void mostrarCaracteristicas() const override {
        Animal::mostrarCaracteristicas();
        std::cout << "Color de Escamas: " << colorEscamas << std::endl;
    }

private:
    std::string colorEscamas;
};

// Clase Inicio para interactuar con el usuario
class Inicio {
public:
    void agregarAnimales() {
        // Crear objetos de cada tipo de animal y mostrar sus características
        Mamifero perro("Perro", "Café", 42);
        Mamifero gato("Gato", "Gris", 30);
        Ave canario("Canario", "Pequeñas", true);
        Ave paloma("Paloma", "Grandes", true);
        Reptil cocodrilo("Cocodrilo", "Verde");
        Reptil lagartija("Lagartija", "Marrón");

        std::cout << "Características de los animales:" << std::endl;

        perro.mostrarCaracteristicas();
        std::cout << std::endl;

        gato.mostrarCaracteristicas();
        std::cout << std::endl;

        canario.mostrarCaracteristicas();
        std::cout << std::endl;

        paloma.mostrarCaracteristicas();
        std::cout << std::endl;

        cocodrilo.mostrarCaracteristicas();
        std::cout << std::endl;

        lagartija.mostrarCaracteristicas();
        std::cout << std::endl;
    }
};

int main() {
    Inicio inicio;
    inicio.agregarAnimales();

    return 0;
}
