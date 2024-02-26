package ies.puerto.presentacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {

    public static void main(String[] args) {
        lectura("src/main/resources/libros.csv");
    }

    public static void lectura(String path) {
        // Crear un objeto File
        File fichero = new File(path);
        // Verifier si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }

    public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
        if (existeF)
    }

}
