package persona;

import java.util.Arrays;
import java.util.Scanner;

public class Estudiante extends Persona{
    private String curso;
    private double[] notas;

    public Estudiante(String nombre, int edad, String dni, String curso, double[] notas) {
        super(nombre, edad, dni);
        this.curso = curso;
        this.notas = notas;
    }

    public Estudiante(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void mostrarCurso () {
        System.out.println("El curso es " + curso);
    }

    public void mostrarNotas () {
        System.out.println("Las notas son " + Arrays.toString(notas));
    }

    @Override
    public String saludar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Haz un saludo personalizado");
        String saludo = scanner.nextLine();
        return saludo;
    }
}
