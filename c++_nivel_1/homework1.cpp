#include <iostream>
#include <cstdlib> // Incluimos la biblioteca para usar la función system
using namespace std;

int main() {
    int referencia;
    char descripcion[30];
    int talla;
    char disponibilidad[30];
    int costo;
    int precio;

    // Imprime el encabezado del programa
    cout << "ADMINISTRAR VENTA DE ZAPATOS" << endl;

    // Solicita y recopila información del usuario
    cout << "Digite la referencia del zapato..." << endl;
    cin >> referencia;
    cin.ignore(256, '\n');
    cout << "Digite una descripción del zapato..." << endl;
    cin.getline(descripcion, 30);
    cout << "Digite la talla..." << endl;
    cin >> talla;
    cin.ignore(256, '\n');
    cout << "Digite la disponibilidad..." << endl;
    cin.getline(disponibilidad, 30);
    cout << "Digite el costo del zapato..." << endl;
    cin >> costo;
    cout << "Digite el precio de venta del zapato..." << endl;
    cin >> precio;

    system("clear"); // Limpia la pantalla en sistemas Unix/Linux (en Windows sería "cls")

    // Muestra la información ingresada por el usuario
    cout << "REFERENCIA: " << referencia << endl;
    cout << "DESCRIPCIÓN: " << descripcion << endl;
    cout << "TALLA: " << talla << endl;
    cout << "DISPONIBILIDAD: " << disponibilidad << endl;
    cout << "COSTO: " << costo << endl;
    cout << "PRECIO DE VENTA: " << precio << endl;
    cout << "Gracias por digitar la información." << endl;

    return 0;
}

