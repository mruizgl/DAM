package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeometrica;

public class Rectangulo extends Cuadrado implements IFormaGeometrica {
    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
}
