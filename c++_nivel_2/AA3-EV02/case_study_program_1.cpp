#include <iostream>
#include <string>

class Empleado {
public:
    std::string cedula;
    std::string nombres;
    std::string telefono;
    std::string cargo;
    double salarioBasico;
    double horasExtras;
    double prestamos;
    double ahorroVoluntario;
    double descuentosSeguridadSocial;

    void ingresarInformacionBasica() {
        std::cout << "Ingrese cédula: ";
        std::cin >> cedula;
        std::cout << "Ingrese nombres: ";
        std::cin.ignore();
        std::getline(std::cin, nombres);
        std::cout << "Ingrese teléfono: ";
        std::cin >> telefono;
        std::cout << "Ingrese cargo: ";
        std::cin.ignore();
        std::getline(std::cin, cargo);
        std::cout << "Ingrese salario básico: ";
        std::cin >> salarioBasico;
    }

    void ingresarInformacionLabor() {
        std::cout << "Ingrese horas extras laboradas: ";
        std::cin >> horasExtras;
        std::cout << "Ingrese descuentos por préstamos: ";
        std::cin >> prestamos;
        std::cout << "Ingrese ahorro voluntario: ";
        std::cin >> ahorroVoluntario;
        std::cout << "Ingrese descuentos por seguridad social: ";
        std::cin >> descuentosSeguridadSocial;
    }

    double calcularValorPagar() {
        double valorPagar = salarioBasico + horasExtras - prestamos - ahorroVoluntario - descuentosSeguridadSocial;
        return valorPagar;
    }

    void mostrarInformacionPago() {
        std::cout << "\nInformación de pago para el empleado:\n";
        std::cout << "Cédula: " << cedula << "\n";
        std::cout << "Nombres: " << nombres << "\n";
        std::cout << "Teléfono: " << telefono << "\n";
        std::cout << "Cargo: " << cargo << "\n";
        std::cout << "Valor a pagar: " << calcularValorPagar() << "\n";
    }
};

int main() {
    Empleado empleado;
    empleado.ingresarInformacionBasica();
    empleado.ingresarInformacionLabor();
    empleado.mostrarInformacionPago();

    return 0;
}
