package ies.puerto;

/**
 * @author Melissa Ruiz
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor por defecto de la clase Libro
     */
    public Libro() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Constructor con los parametros titulo, autor, añoPublicacion
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año de publicación del libro
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Método que imprime  la información del libro
     * @return Devuelve titulo, autor y año de publicación
     */
    public String imprimirInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion;
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