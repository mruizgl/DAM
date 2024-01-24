package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase que tiene como objetivo mostrar informacion sobre eventos
 */
public class Evento {
    private String nombre;
    private String fecha;

    /**
     * Constructor con parametro de entrada nombre
     * @param nombre del evento
     */
    public Evento(String nombre) {
        this.nombre = nombre;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date fechaEvento = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = simpleDateFormat.format(fechaEvento);
    }

    /**
     * Constructor con parametro de entrada nombre y fecha
     * @param nombre del evento
     * @param fecha del evento
     */
    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    /**
     * Metodo main para ejecutar el programa
     * @param args n
     */
    public static void main(String[] args) {
        Evento evento1 = new Evento("Conferencia de Java");
        System.out.println(evento1.informacion());

        Evento evento2 = new Evento("Fiesta de Fin de Año", "31/12/2023");
        System.out.println(evento2.informacion());
    }

    /**
     * Funcion para mostrar informacion del evento e indicar si es proximo o no
     * @return devuelve informacion
     */
    public String informacion() {
        String info = "Nombre del evento: " + nombre +  " Fecha del evento: " + fecha;
        if (estaProximo()) {
            info += "\n¡El evento es próximo!";
        }
        return info;
    }

    /**
     * Funcion que determina si une vento está proximo o no
     * @return devuelve resultado
     */

    public boolean estaProximo() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaEvento = sdf.parse(fecha);

            Calendar fechaActual = Calendar.getInstance();
            fechaActual.add(Calendar.DAY_OF_MONTH, 7);

            if (fechaEvento.before(fechaActual.getTime())) {
                System.out.println("El evento '" + nombre + "' es próximo.");
            } else {
                System.out.println("El evento '" + nombre + "' no es próximo.");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
