package es.ies.puerto.modelo.impl;

import es.ies.puerto.modelo.abstracts.ProductoRecomendableAbstracts;

public class CuidadoPersonal extends ProductoRecomendableAbstracts {

    private int popularity;

    /**
     * Constructors of the class
     */
    public CuidadoPersonal() {
    }

    public CuidadoPersonal(String name, float price, String dateOfEntrance, String udi, int popularity) {
        super(name, price, dateOfEntrance, udi);
        this.popularity = popularity;
    }

    /**
     * Getters and setters
     */
    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public boolean recommendProduct() {
        return popularity >= 7;
    }

    @Override
    public int calculatePopularity() {
        return getPopularity();
    }

    @Override
    public float maxPrice() {
        return getPrice() * 1.8f;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }

    @Override
    public String toString() {
        return "CuidadoPersonal{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", dateOfEntrance='" + super.getDateOfEntrance() + '\'' +
                ", udi='" + super.getUdi() + '\'' +
                ", popularity='" + popularity+ '\'' +
                '}';
    }
    @Override
    public String toCsv() {
        return getName()+DELIMITATOR +getPrice()+DELIMITATOR+getDateOfEntrance()+DELIMITATOR+getUdi()+
                DELIMITATOR+getPopularity();
    }
}
