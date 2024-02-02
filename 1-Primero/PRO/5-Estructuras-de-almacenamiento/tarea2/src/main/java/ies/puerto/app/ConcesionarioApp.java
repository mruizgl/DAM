package ies.puerto.app;

import ies.puerto.impl.Coche;
import ies.puerto.impl.Concesionario;
import ies.puerto.impl.Motocicleta;

import java.util.Arrays;

public class ConcesionarioApp {

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", "ABC123", 60);
        Coche coche2 = new Coche("Honda", "Civic", "XYZ789", 75);
        Coche coche3 = new Coche ("Ford", "Mustang", "DEF456", 100);
        Coche coche4 = new Coche ("Chevrolet", "Impala", "GHI789", 80);
        Coche coche5 = new Coche ("Volkswagen", "Golf", "JKL012", 65);

        Motocicleta moto1 = new Motocicleta("Harley-Davidson", "Sportster", "MNO345", 50);
        Motocicleta moto2 = new Motocicleta("Yamaha", "YZF R6", "PQ678", 90);
        Motocicleta moto3 = new Motocicleta("Ducati", "Monster", "STU901", 70);
        Motocicleta moto4 = new Motocicleta("Kawasaki", "Ninja", "ZAB567", 85);
        Motocicleta moto5 = new Motocicleta("Suzuki", "GSX-R750", "VWX234", 80);

        Concesionario concesionario = new Concesionario();

        concesionario.addCoche(coche1);
        concesionario.addCoche(coche2);
        concesionario.addCoche(coche3);
        concesionario.addCoche(coche4);
        concesionario.addCoche(coche5);

        concesionario.addMotocicleta(moto1);
        concesionario.addMotocicleta(moto2);
        concesionario.addMotocicleta(moto3);
        concesionario.addMotocicleta(moto4);
        concesionario.addMotocicleta(moto5);

        Coche cocheObtenido = concesionario.obtenerCoche("ABC123");
        if (concesionario.existeCoche("ABC123")) {
            System.out.println("\nCoche obtenido: " + cocheObtenido);
        } else {
            System.out.println("\nCoche no encontrado.");
        }


        System.out.println("\nVelocidad media de Coches: " + concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de Motocicletas: " + concesionario.velocidadMediaMotocicletas());
    }
}
