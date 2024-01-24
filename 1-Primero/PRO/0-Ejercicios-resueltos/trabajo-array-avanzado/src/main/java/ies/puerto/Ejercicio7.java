package ies.puerto;

/**
 * Clase que tiene como objetivo en una empresa de transporte guardar el nombre de los conductores que tiene,
 * y los kilómetros que conducen cada día de la semana.
 */
public class Ejercicio7 {


    /**
     * Funcion para calcular los kilometros totales
     * @param kms recorridos
     * @return devuelve resultado
     */
    public int[] calcularTotalKms(int[][] kms) {
        int[] totalKms = new int[kms.length];

        for (int i = 0; i < kms.length; i++) {
            for (int j = 0; j < kms[i].length; j++) {
                totalKms[i] += kms[i][j];
            }
        }

        return totalKms;
    }

    /**
     * Funcion para mostrar resultado
     * @param nombres de los conductores
     * @param kms recorridos por dia
     * @param totalKms recorridos
     */
    public void mostrarResultados(String[] nombres, int[][] kms, int[] totalKms) {
        System.out.println("Resultados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Conductor: " + nombres[i]);
            System.out.print("Kilómetros por día: ");
            for (int j = 0; j < kms[i].length; j++) {
                System.out.print(kms[i][j] + " ");
            }
            System.out.println();
            System.out.println("Kilómetros totales: " + totalKms[i]);
            System.out.println("---------------------");
        }
    }
}
