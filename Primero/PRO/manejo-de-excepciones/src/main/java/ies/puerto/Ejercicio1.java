package ies.puerto;
/**
 * Calcular sumatorio de los n primeros numeros.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        calcularSumatorio(3);
    }

    public static int calcularSumatorio (int n)  {
        int resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado += i;
        }
        return resultado;

    }
}
