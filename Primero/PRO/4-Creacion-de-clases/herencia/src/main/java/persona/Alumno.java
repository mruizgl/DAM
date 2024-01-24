package persona;

public class Alumno extends Persona{
    public Alumno(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Saray", 28, "45684654S");
    }
}
