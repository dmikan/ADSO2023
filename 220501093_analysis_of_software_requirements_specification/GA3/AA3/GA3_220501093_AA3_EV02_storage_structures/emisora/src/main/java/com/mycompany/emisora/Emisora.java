package com.mycompany.emisora;

import java.util.Scanner;

public class Emisora {

    // Constantes
    private static final int MAX_PERSONAS = 6; 
    private static final int MAX_CANCIONES = 3; 

  
    static class Persona {
        String nombre;
        String cedula;
        String fechaNacimiento;
        String correo;
        String ciudadResidencia;
        String ciudadOrigen;
        String[] cancionesFavoritas = new String[MAX_CANCIONES];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[MAX_PERSONAS]; 
        int contadorPersonas = 0; 

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar una persona");
            System.out.println("2. Mostrar información de una persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    if (contadorPersonas < MAX_PERSONAS) {
                        personas[contadorPersonas] = agregarPersona(scanner);
                        contadorPersonas++;
                        System.out.println("Persona agregada correctamente.");
                    } else {
                        System.out.println("No se pueden agregar más personas. Límite alcanzado.");
                    }
                    break;
                case 2:
                    if (contadorPersonas > 0) {
                        System.out.print("Ingrese la posición de la persona (0-" + (contadorPersonas - 1) + "): ");
                        int posicion = scanner.nextInt();
                        if (posicion >= 0 && posicion < contadorPersonas) {
                            mostrarPersona(personas[posicion]);
                        } else {
                            System.out.println("Posición no válida.");
                        }
                    } else {
                        System.out.println("No hay personas registradas.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

   
    private static Persona agregarPersona(Scanner scanner) {
        Persona persona = new Persona();

        System.out.println("\nIngrese los datos de la persona:");
        System.out.print("Nombre: ");
        persona.nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        persona.cedula = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
        persona.fechaNacimiento = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        persona.correo = scanner.nextLine();
        System.out.print("Ciudad de residencia: ");
        persona.ciudadResidencia = scanner.nextLine();
        System.out.print("Ciudad de origen: ");
        persona.ciudadOrigen = scanner.nextLine();

        System.out.println("Ingrese hasta 3 canciones favoritas:");
        for (int i = 0; i < MAX_CANCIONES; i++) {
            System.out.print("Canción " + (i + 1) + " (artista - título): ");
            persona.cancionesFavoritas[i] = scanner.nextLine();
        }

        return persona;
    }


    private static void mostrarPersona(Persona persona) {
        System.out.println("\n--- Información de la persona ---");
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Cédula: " + persona.cedula);
        System.out.println("Fecha de nacimiento: " + persona.fechaNacimiento);
        System.out.println("Correo electrónico: " + persona.correo);
        System.out.println("Ciudad de residencia: " + persona.ciudadResidencia);
        System.out.println("Ciudad de origen: " + persona.ciudadOrigen);
        System.out.println("Canciones favoritas:");
        for (int i = 0; i < MAX_CANCIONES; i++) {
            if (persona.cancionesFavoritas[i] != null && !persona.cancionesFavoritas[i].isEmpty()) {
                System.out.println("  " + (i + 1) + ". " + persona.cancionesFavoritas[i]);
            }
        }
    }
}