package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    String autor = "Mi autor";
    String titulo = "Mi titulo";
    int aniopublicacion = 2022;

    Libro libro;
    @BeforeEach
    public void before() {
        libro = new Libro(titulo, autor, aniopublicacion);
    }

    @Test
    public void constructorTestOk() {
        Libro miLibro = new Libro(titulo, autor, aniopublicacion);
        Assertions.assertEquals(titulo, miLibro.getTitulo(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(autor, miLibro.getAutor(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(aniopublicacion, miLibro.getAnioPublicacion(), "No se ha obtenido el resultado esperado");

    }
    @Test
    public void getTituloTestOk() {
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No se ha obtenido el resultado esperado");

    }
    @Test
    public void setAnioPublicacionTestOk () {
        int otroAnio = 2000;
        libro.setAnioPublicacion(otroAnio);
        Assertions.assertEquals(otroAnio, libro.getAnioPublicacion(), "No se ha obtenido el resultado esperado");

    }

    @Test
    public void setAutorTestOk() {
        String miAutor = "Otro autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No se ha obtenido el resultado esperado");

    }

    @Test
    public void imprimirInformacionTest() {
        String resultado = "Titulo: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + aniopublicacion;
        Assertions.assertEquals(resultado, libro.imprimirInformacion(), "No se ha obtenido el resultado esperado");
    }
}