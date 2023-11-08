package ies.puerto;

import ies.puerto.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @BeforeEach
    public void before() {
        Libro libro = new Libro();
    }
    @Test
    public void imprimirInformacionTest() {
        Libro libro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
        String Resultado = "Título: El Señor de los Anillos Autor: J.R.R. Tolkien Año de Publicación: 1954";
        Assertions.assertEquals(Resultado, libro.imprimirInformacion(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void cambiarAutorTest() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        libro.cambiarAutor("J.K. Rowling");
        assertEquals("J.K. Rowling", libro.getAutor());
    }
}