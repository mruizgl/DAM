package ies.puerto;

/**
 * @author Melissa Ruiz
 */
public class Circulo {
    private double radio;

    /**
     * Constructor por defecto de la clase Circulo
     */
    public Circulo(){}
    /**
     * Constructor con el parametro radio
     * @param radio del circulo
     */
    public Circulo(double radio) {

        this.radio = radio;
    }

    /**
     * Getter para obtener el radio
     * @return devuelve radio
     */
    public double getRadio() {

        return radio;
    }

    /**
     * Setter para establecer el radio
     * @param radio del circulo
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Función para calcular el area del circulo
     * @return devuelve el resultado del area
     */
    public double calcularArea() {

        return 3.141592653589793 * radio * radio;
    }

    /**
     * Función para calcular la circunferencia del circulo
     * @return devuelve el resultado de la circunferencia
     */
    public double calcularCircunferencia() {

        return 2 * 3.141592653589793 * radio;
    }
}



