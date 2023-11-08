package ies.puerto;

/**
 * @author Melissa Ruiz
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    /**
     * Constructor por defecto de la clase Libro
     */
    public Libro() {}

    /**
     * Constructor con los parametros titulo, autor, añoPublicacion
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param añoPublicacion Año de publicación del libro
     */

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Método que imprime  la información del libro
     * @return Devuelve titulo, autor y año de publicación
     */
    public String imprimirInformacion() {
        return "Titulo: " + titulo + "Autor: " + autor + "Año de Publicación: " + añoPublicacion;
    }

    /**
     * Método que cambia el autor del libro
     * @param nuevoAutor Variable que introduce el nuevo dato del autor
     */
    public void cambiarAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }

    public String getAutor() {
        return autor;
    }
}