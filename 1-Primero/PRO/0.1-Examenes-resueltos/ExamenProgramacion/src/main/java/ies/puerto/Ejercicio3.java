package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio3 {

    private String nombre;
    private String dni;

    private Date fechaNacimiento;


    public Ejercicio3(){}

    public Ejercicio3(String nombre,String dni,String fechaNacimimiento) throws ParseException{
        this.nombre=nombre;
        this.dni=dni;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try{

            this.fechaNacimiento= formato.parse(fechaNacimimiento);


        }catch (ParseException exception){

            throw new ParseException("No es una fecha válida",exception.getErrorOffset());

        }

    }

    /**
     * Funcion que calcula en base a la fecha actual y la fecha de la persona su edad
     * @return la edad de la persona
     */
    public int mayorEdad(){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);


        return edad;
    }


    /**
     * Funcion que muestra la informacion
     * @return la informacion de la persona y si es mayor de edad
     */
    public String informacion(){

        if(mayorEdad()>=18){
            System.out.println("Esta persona es mayor de edad");
        }

       return "Nombre: " + nombre + "\n" + "Dni: " + dni + "\n" + "FechaNacimiento: " + fechaNacimiento;
    }


    public static void main(String[] args) throws Exception {

        Ejercicio3 persona = new Ejercicio3("Manolo","78345623G","21/10/1987");
        System.out.println(persona.informacion());



    }


}
