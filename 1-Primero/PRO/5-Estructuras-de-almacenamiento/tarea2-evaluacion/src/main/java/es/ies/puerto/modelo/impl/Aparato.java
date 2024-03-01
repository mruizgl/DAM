package es.ies.puerto.modelo.impl;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;

public class Aparato extends ProductoAbstracts {

    /**
     * Constructors of the class
     */
    public Aparato() {
    }

    public Aparato(String name, float price, String dateOfEntrance, String udi) {
        super(name, price, dateOfEntrance, udi);
    }

    @Override
    public float maxPrice() {
        return super.getPrice()*1.42f;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }

    /**
     * Method to String
     */
    @Override
    public String toString() {
        return "Aparato{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", dateOfEntrance='" + super.getDateOfEntrance() + '\'' +
                ", udi='" + super.getUdi() + '\'' +
                '}';
    }
    @Override
    public String toCsv() {
        return getName()+DELIMITATOR +getPrice()+DELIMITATOR+getDateOfEntrance()+DELIMITATOR+getUdi();
    }
}
