package ies.puerto;


/**
 * Clase que tiene como objetivo hacer un juego de las 5 puertas. Asumiendo que todas están cerradas jugaremos con
 * ciertos métodos para abrirlas, cerrarlas, cambiar su estado, mostrarlas en pantalla...
 */
public class Ejercicio4 {
static int [] puertas = {0, 0, 0, 0, 0};

    /**
     * Método main donde podemos llamar a cada función para ir jugando con ello.
     * @param args
     */
    public static void main(String[] args) {
        //abrirPuerta(2);
        cerrarPuerta(2);
        //cambiarEstadoPuerta(2);
        //mostrarEstadoPuertas();
    }

    /**
     * Funcion para abrir puerta en función de la entrada que le indiquemos
     * @param numeroPuerta puerta que abriremos.
     */
    public static void abrirPuerta (int numeroPuerta) {
        puertas [numeroPuerta] = 1;
        if (puertas[numeroPuerta] == 1) {
                System.out.println("La puerta numero " + numeroPuerta + " se ha abierto con éxito.");
        }
    }


    /**
     * Funcion para cerrar puertas en funcion de la entrada que le indiquemos
     * @param numeroPuerta puerta que cerraremos.
     */
    public static void cerrarPuerta (int numeroPuerta) {

        if (puertas[numeroPuerta] == 0) {
            System.out.println("La puerta numero " + numeroPuerta + " ya estaba cerrada, asi que no ha habido cambios");
        } else {
            puertas [numeroPuerta] = 0;
            System.out.println("La puerta numero " + numeroPuerta + " se ha cerrado con éxito.");
        }
    }

    /**
     * Funcion que cambia el estado de la puerta que le indiquemos
     * @param numeroPuerta que cambiaremos de estado
     */
    public static void cambiarEstadoPuerta (int numeroPuerta) {

        if (puertas[numeroPuerta] == 0) {
                puertas[numeroPuerta] = 1;
                System.out.println("La puerta estaba cerrada y se ha abierto");
        } else if (puertas[numeroPuerta] == 1){
                puertas[numeroPuerta] = 0;
                System.out.println("La puerta estaba abierta y se ha cerrado");
        }
    }


    /**
     * Funcion que muestra el estado de todas las puertas.
     */
    public static void mostrarEstadoPuertas () {
        for (int i = 0; i < 5; i++) {
            if (puertas[i] == 0); {
                System.out.println("La puerta numero " + i + " está cerrada");
            }if (puertas[i] == 1) {
                System.out.println("La puerta numero " + i + " está abierta");
            }
        }
    }
}
