package app;

import vehiculo.Coche;

import java.util.Scanner;

public class AppCoche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona 1 si desea ver la marca y modelo del vehiculo seleccionado"+"\nSeleccione 2 si desea ver el precio del vehiculo seleccionado"+"\nSeleccione 3 si desea salir del programa");
        int seleccion = scanner.nextInt();
        Coche miCoche = new Coche("Dacia", "Sandero", 140000.50);
        if (seleccion == 1) {
            miCoche.mostrarMarcaModelo();
        }else if (seleccion == 2) {
            miCoche.mostrarMarcaModelo();
        }else if (seleccion == 3) {
            System.out.println("Ha salido del programa");
        }else {
            System.out.println("Por favor, reinice el programa y seleccione una opciçon válida");
        }


    }
}
