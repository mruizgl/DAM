package ies.puerto;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    /**
     * Constructor por defecto de la clase Estudiante
     */
    public Estudiante() {}
    /**
     * Constructor con todos los parametros
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param carrera del estudiante
     * @param promedio del estudiante
     */
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * Función que verifica si el alumno está aprobado o suspendido
     * @return devuelve resultado
     */
    public String verificarEstado() {
        if (promedio >= 6.0) {
            return nombre + " está aprobado.";
        } else {
            return nombre + " está suspendido.";
        }
    }

    /**
     * Funcion que muestra detalles del estudiante
     * @return devuelve resultado
     */
    public String mostrarDetalles() {
        return "Nombre: "+ nombre +", Edad: "+edad+", Carrera: "+carrera+", Promedio: "+promedio;
    }
}
