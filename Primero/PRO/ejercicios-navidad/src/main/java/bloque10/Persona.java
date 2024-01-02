package bloque10;

import java.util.regex.Pattern;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        personas [0] = new Persona("Pablo", "Zamora", 36);
        personas[1] = new Persona("Sara", "Quintana", 26);
        personas [2] = new Persona("María", "Lemus", 15);
        personas [3] = new Persona("Juan", "Pérez", 28);
        personas [4] = new Persona("Melissa", "Ruiz", 26);
        for (int i = 0; i < personas.length; i++) {
            mostrarInformacion(personas[i]);
        }
        mayorEdad(personas[1], personas[4]);
        System.out.println("El promedio de edad de este grupo de personas es "+promedio(personas));
        personas[0].actualizarEdad(16);
        ordenarPorEdad(personas);
        String nombreBuscado = "Juan";
        Persona[] personasConNombre = obtenerPersonasConNombre(personas, nombreBuscado);

        System.out.println("\nPersonas con el nombre '" + nombreBuscado + "':");
        for (Persona persona : personasConNombre) {
            persona.mostrarInformacion(persona);
        }

        String dniAValidar = "12345678A";
        if (validarDni(dniAValidar)) {
            System.out.println("\nEl DNI " + dniAValidar + " es válido.");
        } else {
            System.out.println("\nEl DNI " + dniAValidar + " no es válido.");
        }

    }

    public static void mostrarInformacion (Persona persona) {
        System.out.println("El nombre de la persona es " + persona.getNombre() +", su apellido es " + persona.getApellido() + " y su edad es " + persona.getEdad());
    }

    public static void mayorEdad (Persona persona1, Persona persona2) {
        if (persona1.getEdad() > persona2.getEdad()) {
            System.out.println(persona1.getNombre()+  " es mayor que " + " " + persona2.getNombre());
        }else if (persona2.getEdad() < persona1.getEdad()){
            System.out.println(persona2.getNombre()+  " es mayor que " + persona1.getNombre());
        }else if (persona1.getEdad() == persona2.getEdad()) {
            System.out.println("Tienen la misma edad");
        }
    }
    public static double promedio(Persona[] grupo) {
        int sumaEdades = 0;
        for (Persona persona : grupo) {
            sumaEdades += persona.getEdad();
        }

        return (double) sumaEdades / grupo.length;
    }

    public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println(nombre + " ahora tiene " + nuevaEdad + " años.");

        if (nuevaEdad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    public static void ordenarPorEdad(Persona[] personas) {
        int n = personas.length;
        boolean intercambiado;

        do {
            intercambiado = false;

            for (int i = 0; i < n - 1; i++) {
                if (personas[i].getEdad() > personas[i + 1].getEdad()) {
                    Persona temp = personas[i];
                    personas[i] = personas[i + 1];
                    personas[i + 1] = temp;

                    intercambiado = true;
                }
            }

            n--;
        } while (intercambiado);
    }

    public static Persona[] obtenerPersonasConNombre(Persona[] personas, String nombreBuscado) {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                count++;
            }
        }

        Persona[] personasConNombre = new Persona[count];
        int index = 0;

        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                personasConNombre[index] = persona;
                index++;
            }
        }

        return personasConNombre;
    }

    public static boolean validarDni(String dni) {
        String regex = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(regex, dni);
    }
}
