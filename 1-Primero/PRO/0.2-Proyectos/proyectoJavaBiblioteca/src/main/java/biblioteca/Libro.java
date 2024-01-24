package biblioteca;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadCopiasDisponibles;

    //////////GETTER Y SETTERS/////////////

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
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

    public int getCantidadCopiasDisponibles() {
        return cantidadCopiasDisponibles;
    }

    public void setCantidadCopiasDisponibles(int cantidadCopiasDisponibles) {
        this.cantidadCopiasDisponibles = cantidadCopiasDisponibles;
    }

    /////////////////////////////////////////

    /**
     * Constructor por defecto
     */
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int anioPublicacion, int cantidadCopiasDisponibles) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantidadCopiasDisponibles = cantidadCopiasDisponibles;
    }

    public Libro(String ISBN, String titulo, String autor, int anioPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public 
}
