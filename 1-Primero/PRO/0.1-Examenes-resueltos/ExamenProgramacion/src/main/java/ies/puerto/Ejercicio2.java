package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {

    private static String nombre;
    private static Date fecha;

    public Ejercicio2(){}

    public Ejercicio2(String nombre,String fecha) throws ParseException{

            this.nombre=nombre;


        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            this.fecha= formato.parse(fecha);


        }catch (ParseException exception){

            throw new ParseException("No es una fecha válida",exception.getErrorOffset());

        }


    }

     public  Ejercicio2(String nombre) throws Exception{


            if(this.nombre.length() < 20){

                throw new Exception("El numero de caracteres es inferior a 20");

            }

         Calendar fechaActual = Calendar.getInstance();

         fechaActual.add(Calendar.MONTH,1);

        }


    /**
     * Funcion que mira si la fecha esta dentro de los proximos 7 dias
     * @return true o false si esta proxima
     */
    public static boolean eventoProximo(){

        Calendar fechaHoy = Calendar.getInstance();
        fechaHoy.setTime(fecha);

         boolean diasAntes=fechaHoy.before(Calendar.DAY_OF_MONTH);

         return diasAntes;
        }

    /**
     * Funcion que muestra la informacion del evento
     * @return la informacion del evento y si esta proximo
     */
    public static String informacion(){

            if(eventoProximo()){
                System.out.println("\n¡El evento está proximo!");
            }

        return "NombreEvento: " + nombre + "\n" + "FechaDelEvento: " + fecha;




        }

    public static void main(String[] args) throws Exception {

        Ejercicio2 ejercicio2 = new Ejercicio2("RallyeDeAndorraEsteDomingo","16/12/2023");
        System.out.println(ejercicio2.informacion());




    }



}





