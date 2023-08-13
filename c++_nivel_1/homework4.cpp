#include <iostream>
using namespace std; 

int main() { 

    char registro = 's';
    int referencia;
    float talla, costo; 
    char descripcion[100];

    while (registro == 's' || registro == 'S') { 

        cout << endl << "Desea registrar otros zapatos (escriba S para sí o N para no) : ";
        cin >> registro;

        if (registro == 's' || registro == 'S') {
            cout << "Digite la referencia de los zapatos: ";
            cin >> referencia;
            cin.ignore();

            cout << "Digite una descripcion del zapato: ";
            cin.getline(descripcion, 100);

            cout << "Digite la talla : ";
            cin >> talla;

            cout << "Digita el Costo del zapato: ";
            cin >> costo;
        }
    }

    cout << "FIN DE LA APLICACIÓN" << endl;

    return 0;
}
