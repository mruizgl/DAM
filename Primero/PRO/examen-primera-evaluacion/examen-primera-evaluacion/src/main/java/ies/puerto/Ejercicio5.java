package ies.puerto;

public class Ejercicio5 {
    /**
     * Método main para ejecutar y probar su funcionalidad.
     * @param args null
     */

    public static void main(String[] args) {
        mesIfSele(4);
    }

    /**
     * Funcion que muestra el mes en función del número que le indiques
     * @param numero del mes
     * @return muestra el mes que corresponde a la posicion del numero introducido en el parámetro de entrada
     */
    public static String mesIfSele(int numero) {

        if (numero == 1) {
            System.out.println("El mes es enero");
        }
        if (numero == 2) {
            System.out.println("El mes es febrero");
        }
        if (numero == 3) {
            System.out.println("El mes es marzo");
        }
        if (numero == 4) {
            System.out.println("El mes es abril");
        }
        if (numero == 5) {
            System.out.println("El mes es mayo");
        }
        if (numero == 6) {
            System.out.println("El mes es junio");
        }
        if (numero == 7) {
            System.out.println("El mes es julio");
        }
        if (numero == 8) {
            System.out.println("El mes es agosto");
        }
        if (numero == 9) {
            System.out.println("EL mes es septiembre");
        }
        if (numero == 10) {
            System.out.println("EL mes es octubre");
        }
        if (numero == 11) {
            System.out.println("El mes es noviembre");
        }
        if (numero == 12) {
            System.out.println("El mes es noviembre");
        }

        return "El mes es " + numero;
    }

    /**
     * Funcion para indicar numero de caso y mostrar el numero de mes.
     * @param numero el mes a mostrar
     */
    public static void mesSwitch(int numero) {

        switch (numero) {
            case 1:
                System.out.println("El mes es enero");

            case 2:
                System.out.println("El mes es febrero");

            case 3:
                System.out.println("El mes es marzo");

            case 4:
                System.out.println("El mes es abril");

            case 5:
                System.out.println("El mes es mayo");

            case 6:
                System.out.println("El mes es junio");

            case 7:
                System.out.println("El mes es julio");

            case 8:
                System.out.println("El mes es agosto");

            case 9:
                System.out.println("EL mes es septiembre");

            case 10:
                System.out.println("EL mes es octubre");

            case 11:
                System.out.println("El mes es noviembre");

            case 12:
                System.out.println("El mes es noviembre");

        }

    }


}

