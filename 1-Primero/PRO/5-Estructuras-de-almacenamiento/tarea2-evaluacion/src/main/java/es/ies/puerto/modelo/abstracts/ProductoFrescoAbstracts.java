package es.ies.puerto.modelo.abstracts;

import es.ies.puerto.modelo.interfaces.ISaludable;

public abstract class ProductoFrescoAbstracts extends ProductoAbstracts implements ISaludable {
    private String expireDate;

    /**
     * Constructors of the class
     */
    public ProductoFrescoAbstracts (){}

    public ProductoFrescoAbstracts (String expireDate){
        this.expireDate = expireDate;
    }

    public ProductoFrescoAbstracts(String name, float price, String dateOfEntrance, String udi, String expireDate) {
        super(name, price, dateOfEntrance, udi);
        this.expireDate = expireDate;
    }

    /**
     * Getters and setters
     */
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * Method to String
     */
    @Override
    public String toString() {
        return "ProductoFrescoAbstracts{" +
                "expireDate='" + expireDate + '\'' +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", dateOfEntrance='" + super.getDateOfEntrance() + '\'' +
                ", udi='" + super.getUdi() + '\'' +
                '}';
    }

}
