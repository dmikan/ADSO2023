#include <iostream>
#include <cmath>
#include <cstdlib>

class Calculadora {
public:
    // Constructor por defecto
    Calculadora() {}

    // Constructor con parámetros iniciales
    Calculadora(int num1, int num2) : num1(num1), num2(num2) {}
    Calculadora(double num1, double num2) : num1(num1), num2(num2) {}
    Calculadora(char* strNum1, char* strNum2) : num1(strtod(strNum1, nullptr)), num2(strtod(strNum2, nullptr)) {}

    // Destructor
    ~Calculadora() {}

    // Métodos para realizar operaciones
    int suma() {
        return num1 + num2;
    }

    int resta() {
        return num1 - num2;
    }

    int multiplicacion() {
        return num1 * num2;
    }

    double division() {
        if (num2 != 0) {
            return static_cast<double>(num1) / num2;
        } else {
            std::cerr << "Error: División entre cero" << std::endl;
            return 0.0;
        }
    }

    double potenciacion() {
        return pow(num1, num2);
    }

private:
    int num1;
    int num2;
};

int main() {
    int intNum1 = 10, intNum2 = 5;
    double doubleNum1 = 3.5, doubleNum2 = 2.0;
    char charNum1[] = "7", charNum2[] = "3";

    // Uso de los constructores y operaciones de la calculadora
    Calculadora calcInt(intNum1, intNum2);
    Calculadora calcDouble(doubleNum1, doubleNum2);
    Calculadora calcChar(charNum1, charNum2);

    std::cout << "Operaciones con enteros:" << std::endl;
    std::cout << "Suma: " << calcInt.suma() << std::endl;
    std::cout << "Resta: " << calcInt.resta() << std::endl;
    std::cout << "Multiplicación: " << calcInt.multiplicacion() << std::endl;
    std::cout << "División: " << calcInt.division() << std::endl;
    std::cout << "Potenciación: " << calcInt.potenciacion() << std::endl;

    std::cout << "Operaciones con dobles:" << std::endl;
    std::cout << "Suma: " << calcDouble.suma() << std::endl;
    std::cout << "Resta: " << calcDouble.resta() << std::endl;
    std::cout << "Multiplicación: " << calcDouble.multiplicacion() << std::endl;
    std::cout << "División: " << calcDouble.division() << std::endl;
    std::cout << "Potenciación: " << calcDouble.potenciacion() << std::endl;

    std::cout << "Operaciones con caracteres convertidos a números:" << std::endl;
    std::cout << "Suma: " << calcChar.suma() << std::endl;
    std::cout << "Resta: " << calcChar.resta() << std::endl;
    std::cout << "Multiplicación: " << calcChar.multiplicacion() << std::endl;
    std::cout << "División: " << calcChar.division() << std::endl;
    std::cout << "Potenciación: " << calcChar.potenciacion() << std::endl;

    return 0;
}
