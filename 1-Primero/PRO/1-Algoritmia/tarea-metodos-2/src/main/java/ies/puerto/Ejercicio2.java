package ies.puerto;

/**
 * Clase que tiene como objetivo indicar si numero es positivo o negativo,  par o impar
 * @author Melissa Ruiz
 */
public class Ejercicio2 {
    /**
     * Funcion que verifica si numero es par o impar
     * @param numero  el numero que verificamos
     * @param esPar  indica si el numero es par o lo contrario
     * @return devuelve valor true o false sobre si es par
     */
    public boolean esPar(int numero, boolean esPar) {
        if (numero % 2 == 0) {
            esPar = true;
            System.out.println("El numero es par");
        } else {
            esPar = false;
            System.out.println("El numero es impar");
        }
        return esPar;
    }

    /**
     * Funcion que verifica si numero es positivo o negativo,
     * @param numero numero que verificamos
     * @param esPositivo indica si numero es positivo o lo contrario
     * @return devuelve valor verdadero o falso sobre si es positivo
     */
    public boolean esPositivo(int numero, boolean esPositivo) {

        if (numero >= 0) {
            esPositivo = true;
            System.out.println("El numero es positivo");
        } else {
            esPositivo = false;
            System.out.println("El numero es negativo");
        }
        return esPositivo;
    }
}