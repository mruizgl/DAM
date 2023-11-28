package ies.puerto;

/**
 * Clase que representa un estudiante con los siguientes atributos: edad, peso, altura y nombre.
 */
public class Ejercicio2 {

    private int edad;
    private double peso;
    private double altura;
    private String nombre;

/*
Getter y setters
 */
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Constructor por defecto
     */
    public Ejercicio2 () {}

    /**
     * Constructor con el parámetro edad
     * @param edad del estudiante
     */
    public Ejercicio2(int edad) {
        this.edad = edad;
    }

    /**
     * Constructor con el parámetro de peso del estudiante.
     * @param peso del estudiante.
     */
    public Ejercicio2(double peso) {
        this.peso = peso;
    }

    /**
     * Constructor con el parámetro nombre.
     * @param nombre del estudiante
     */
    public Ejercicio2(String nombre) {
        this.nombre = nombre;
    }

    /**
     * COnstructor con todos los parámetros
     * @param edad del estudiante
     * @param peso del estudiante
     * @param altura del estudiante
     * @param nombre del estudiante
     */
    public Ejercicio2(int edad, double peso, double altura, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
    }

    /**
     * Constructor con los parámetros de edad y peso
     * @param edad del estudiante
     * @param peso peso del estudiante
     */
    public Ejercicio2(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Constructor con los parámetros de edad, peso y altura
     * @param edad del estudiante
     * @param peso del estudiante
     * @param altura del estudiante
     */
    public Ejercicio2(int edad, double peso, double altura) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Constructor con tres parametros
     * @param peso del estudiante
     * @param altura del estudiante
     * @param nombre del estudiante
     */
    public Ejercicio2(double peso, double altura, String nombre) {
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
    }

    /**
     * Constructor con los parametros de edad y nombre
     * @param edad del estudiante
     * @param nombre del estudiante
     */
    public Ejercicio2(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Constructor con los parametros de peso y altura.
     * @param peso del estudiante
     * @param altura del estudiante
     */
    public Ejercicio2(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Constructor con los parametros de altura y nombre
     * @param altura del estudiante
     * @param nombre del estudiante
     */
    public Ejercicio2(double altura, String nombre) {
        this.altura = altura;
        this.nombre = nombre;
    }

    /**
     * Constructor con los parametros de edad, peso y nombre
     * @param edad del estudiante
     * @param peso del estudiante
     * @param nombre del estudiante
     */
    public Ejercicio2(int edad, double peso, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    /**
     * Funcion para calcular el IMC
     * @param peso del estudiante
     * @param altura del estudiante
     * @return devuelve el resultado.
     */
    public double calcularIMC (double peso, double altura) {
        peso = this.peso;
        altura = this.altura;
        double imc = peso / (altura*altura);

        return imc;

    }

    /**
     * Funcion para mostrar informacion del estudiante
     * @return devuelve resultado
     */
    public String mostrarInformacion () {

        return "El nombre del estudiante es " + this.nombre + ", su altura es +" + this.altura + ", su peso es " + this.peso +
                ", su edad es " + this.edad + "y su IMC es: " + calcularIMC(this.peso, this.altura);
    }


}
