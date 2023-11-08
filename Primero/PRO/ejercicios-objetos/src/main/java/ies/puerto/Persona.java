package ies.puerto;

/**
 * @author Melissa
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * Constructor por defecto de la clase
     */
    public Persona() {}

    /**
     * Constructor con los parametros nombre, edad, email y telefono
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     public void imprimir() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Edad: " + edad);
     System.out.println("Email: " + email);
     System.out.println("Telefono: " + telefono);
     }
     */
    public String imprimir() {
        return "Nombre: " + nombre + "Edad: " + edad + "email: " + email + "Teléfono: " + telefono;
    }
}
