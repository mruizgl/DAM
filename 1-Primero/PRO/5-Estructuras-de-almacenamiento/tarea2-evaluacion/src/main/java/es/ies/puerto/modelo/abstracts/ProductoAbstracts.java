package es.ies.puerto.modelo.abstracts;

import es.ies.puerto.modelo.interfaces.IVendible;

import java.util.HashMap;
import java.util.Objects;

public abstract class ProductoAbstracts implements IVendible {
    public final String DELIMITATOR = ",";
    private String name;
    private float price;
    private String dateOfEntrance;
    private String udi;

    /**
     * Constructors of the class
     */
    public ProductoAbstracts (){}

    public ProductoAbstracts(String name, float price, String dateOfEntrance, String udi) {
        this.name = name;
        this.price = price;
        this.dateOfEntrance = dateOfEntrance;
        this.udi = udi;
    }

    /**
     * Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDateOfEntrance() {
        return dateOfEntrance;
    }

    public void setDateOfEntrance(String dateOfEntrance) {
        this.dateOfEntrance = dateOfEntrance;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    public String toCsv() {
        return getName()+DELIMITATOR +getPrice()+DELIMITATOR+getDateOfEntrance()+DELIMITATOR+getUdi();
    }

    /**
     * Method to String
     */
    @Override
    public String toString() {
        return "ProductoAbstracts{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfEntrance='" + dateOfEntrance + '\'' +
                ", udi='" + udi + '\'' +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoAbstracts that = (ProductoAbstracts) o;
        return Objects.equals(udi, that.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }

}
