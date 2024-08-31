package com.losglobitos;

import java.util.Scanner;

public class Menu {
    private Empresa empresa;
    private Scanner scanner;

    public Menu(Empresa empresa) {
        this.empresa = empresa;
        this.scanner = new Scanner(System.in);
    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Facturar");
            System.out.println("2. Ver o Agregar a Logística");
            System.out.println("3. Modificar Estado o Producción");
            System.out.println("4. Modificar o Agregar Cliente");
            System.out.println("5. Modificar o Agregar Vendedor");
            System.out.println("6. Modificar o Agregar Proveedor");
            System.out.println("7. Modificar o Añadir Categoría");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 8);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                System.out.println("Ingrese el código del cliente:");
                String codigoCliente = scanner.next();
                System.out.println("Ingrese el nuevo nombre del cliente:");
                String nombreCliente = scanner.next();
                empresa.modificarCliente(codigoCliente, nombreCliente);
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo.");
                break;
        }
    }
}

