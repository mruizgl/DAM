package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hola chicos, soy el ejemplo 3");
        File archivo = new File("archivo.txt");

        System.out.println("Voy a generar un NullPoninter" + archivo.getName());


    }
}
