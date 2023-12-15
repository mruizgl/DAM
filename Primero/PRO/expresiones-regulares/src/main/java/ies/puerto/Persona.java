package ies.puerto;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "19/03/1997";
        Date date = formatter.parse(dateInString);
        Persona persona = new Persona("Melissa", date);
        System.out.println("El nombre es " + persona.nombre + ", su edad es " + persona.calcularEdad() + " y su signo del zodiaco es " + persona.signoZodiaco());
    }

    public long calcularEdad () {
        Date date = new Date();
        long tsfechaActual = date.getTime();
        System.out.println(tsfechaActual);
        long tsfechaNacimiento = this.fechaNacimiento.getTime();
        System.out.println(tsfechaNacimiento);
        long resultado = tsfechaActual - tsfechaNacimiento;
        long edad = resultado / 31556952000l;

        return edad;
    }

    public String signoZodiaco () {
        if ((this.fechaNacimiento.getDate() >= 20 && this.fechaNacimiento.getMonth() == 0) || (this.fechaNacimiento.getDate() <= 18 && this.fechaNacimiento.getMonth() == 1) ) {
            return "Acuario";
        }else if ((this.fechaNacimiento.getDate() >= 19 && this.fechaNacimiento.getMonth() == 1) || (this.fechaNacimiento.getDate() <= 20 && this.fechaNacimiento.getMonth() == 2)){
            return "Piscis";
        }else {
            return "desconocido";
        }
    }
}
