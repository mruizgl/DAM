package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase para pedir 5 números, mostrar los 5 números, muestra la suma y los muestra en orden creciente y en orden decreciente.
 * @author Melissa Ruiz
 */
public class Ejercicio3 {
    /**
     * Funcion que suma dos valores
     *
     * @param valor1 Primer numero
     * @param valor2 Segundo numero
     */
    public int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int suma(int valor1, int valor2, int valor3) {
        int resultado = suma(valor1, valor2);
        return suma(resultado, valor3);
    }

    public int mayor (int valor1, int valor2) {
        int resultado = valor1;
        if (valor1 > valor2) {
            resultado = valor2;
        }
        return resultado;
    }

    public int mayor (int valor1, int valor2, int valor3) {
        int resultado = mayor(valor1, valor2);
        return resultado;
    }

    public int menor (int valor1, int valor2) {
        int resultado = valor2;
        if (valor1 > valor2) {
            resultado = valor2;
        }
        return resultado;
    }
    public int menor (int valor1, int valor2, int valor3) {
        int resultado = menor(valor1, valor2);
        return resultado;
    }

    public int intermedio (int valor1, int valor2, int valor3) {
        int mayor = mayor(valor1, valor2);
        int menor = menor(valor1, valor2);
        int intermedio = mayor - menor;

        return intermedio;
    }

    public String mostrarOrdenCreciente (int valor1, int valor2) {
        int mayor = mayor(valor1, valor2);
        int menor = menor(valor1, valor2);
        int intermedio = mayor - menor;

        return "El orden creciente es " + mayor + ", " + menor + ", " + intermedio;

    }

}

