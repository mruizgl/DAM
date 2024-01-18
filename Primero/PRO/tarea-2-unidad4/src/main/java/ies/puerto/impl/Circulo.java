package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return 3.14f * (radio*radio);
    }
}
