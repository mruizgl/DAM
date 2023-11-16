package ies.puerto;

public class Ejercicio3 {

    /**
     * Funcion que indica el resultado del alumno ***********debi hacerlo con if else anidado
     * @param nota del alumno
     * @param resultado del alumno
     * @return devuelve resultado
     */
    public String clasificacionEstudiantes(double nota, String resultado) {


        if (nota > 0 && nota <4.99) {
            resultado = "Suspendido";
        }
        if (nota >5 && nota < 5.99) {
            resultado = "Aprobado";
        }
        if (nota > 6 && nota < 6.99) {
            resultado = "Bien";
        }
        if (nota > 7 && nota < 8.99) {
            resultado = "Notable";
        }
        if (nota > 9 && nota < 10) {
            resultado = "Sobresaliente";
        }
        return " El alumno tiene un "+ resultado;
    }

    public String clasificacionEstudiantes(double nota) {
        String calificacion = "";

        int enteros = (int) nota;
        switch (enteros) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                calificacion = "Suspenso";
            case 5:
                calificacion = "Aprobado";
            case 6:
                calificacion = "Bien";
            case 7:
                calificacion = "Notable";
            case 8:
                calificacion = "Notable";
            case 9:
                calificacion = "Sobresaliente";
            case 10:
                calificacion = "Sobresaliente";
        }
        return calificacion;

    }

}
