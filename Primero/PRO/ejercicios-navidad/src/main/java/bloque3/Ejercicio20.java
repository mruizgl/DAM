package bloque3;

/**
 * Crea un programa que declare dos variables booleanas, representando por ejemplo si está lloviendo y si es de noche,
 * y luego utilice operadores lógicos para determinar si se debe encender una lámpara.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        boolean estaLloviendo = false;
        boolean esNoche = true;
        if (estaLloviendo == true || esNoche == true) {
            System.out.println("Debe encender la lampara");
        }else {
            System.out.println("No hace falta encender la lampara");
        }
    }
}
