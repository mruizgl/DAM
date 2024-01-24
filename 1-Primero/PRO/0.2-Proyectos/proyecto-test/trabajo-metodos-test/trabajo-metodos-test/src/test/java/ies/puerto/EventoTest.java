package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventoTest {
    @Test
    public void testInformacion() {
        Evento evento = new Evento("Conferencia de Java");
        String resultado = evento.informacion();
        Assertions.assertEquals("Nombre del evento: Conferencia de Java Fecha del evento: 12/01/2024", resultado,
                "No se ha obtenido el resultado esperado");
    }

    @Test
    public void testEstaProximo() {
        Evento evento = new Evento("Fiesta de Fin de Año", "31/12/2023");
        boolean resultado = evento.estaProximo();
        Assertions.assertEquals(false, resultado, "No se ha obtenido el resultado esperado");
    }
}
