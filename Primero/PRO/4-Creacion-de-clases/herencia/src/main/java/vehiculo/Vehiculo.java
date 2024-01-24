package vehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarMarcaModelo () {
        System.out.println("La marca es " + marca + " y el modelo es " + modelo);
    }

    public void mostrarPrecio (Vehiculo vehiculo) {
        System.out.println("El precio del vehiculo seleccionado es " + precio);
    }

}
