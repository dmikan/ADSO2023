#include <iostream>
#include <cstdlib> // Incluimos la biblioteca para usar la función system
using namespace std;

int main() {
    int referencia, talla, cantidad, costo, precio, costo_total, precio_total, utilidad_unidad, utilidad_total;
    char descripcion[100], disponibilidad;
    float porcentaje_utilidad;

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
    cout << "Digite la disponibilidad (S o N)..." << endl;
    cin >> disponibilidad;
    cout << "Digite cantidad de zapatos..." << endl;
    cin >> cantidad;
    cout << "Digite el costo del zapato por unidad..." << endl;
    cin >> costo;
    cout << "Digite el precio de venta del zapato..." << endl;
    cin >> precio;

    // Definicion de variables derivadas
    costo_total = costo * cantidad;
    precio_total = precio * cantidad;
    utilidad_unidad = precio - costo;
    utilidad_total = cantidad * utilidad_unidad;
    porcentaje_utilidad = ((float)utilidad_total / (float)precio_total) * 100; //el float hace casting

    system("clear"); // Limpia la pantalla en sistemas Unix/Linux (en Windows sería "cls")

    // Muestra la información ingresada por el usuario
    cout << "LOS DATOS REGISTRADOS SON LOS SIGUIENTES" << endl;
    cout << "REFERENCIA: " << referencia << endl;
    cout << "DESCRIPCIÓN: " << descripcion << endl;
    cout << "TALLA: " << talla << endl;
    cout << "DISPONIBILIDAD: " << disponibilidad << endl;
    cout << "CANTIDAD DE ZAPATOS: " << cantidad << endl;
    cout << "COSTO UNIDAD: " << costo << endl;
    cout << "COSTO TOTAL: " << costo_total << endl;
    cout << "PRECIO UNIDAD: " << precio << endl;
    cout << "PRECIO TOTAL DE " << cantidad << " UNIDADES: " << precio_total << endl;
    cout << "UTILIDAD POR UNIDAD: " << utilidad_unidad << endl;
    cout << "UTILIDAD TOTAL: " << utilidad_total << endl;
    cout << "PORCENTAJE DE UTILIDAD: " << porcentaje_utilidad << " %" << endl;

    cout << "Gracias por digitar la información." << endl;

    return 0;
}
