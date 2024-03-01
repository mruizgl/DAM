package es.ies.puerto.modelo.impl;
import es.ies.puerto.modelo.abstracts.ProductoFrescoAbstracts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends ProductoFrescoAbstracts {
    /**
     * Constructors of the class
     */
    public Alimento (){}

    public Alimento(String name, float price, String dateOfEntrance, String udi, String expireDate) {
        super(name, price, dateOfEntrance, udi, expireDate);
    }

    /**
     * Method to get the max price
     * @return price*1.35f
     */
    @Override
    public float maxPrice() {
     return super.getPrice()*1.35f;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }

    @Override
    public int daysUntilExpiredProduct() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedExpiredDate = dateFormat.parse(getExpireDate());
        Date dateOFEntrance = dateFormat.parse(super.getDateOfEntrance());

        long millisecondsPerDay = 24*60*60*1000L;
        long differenceInMilliseconds = parsedExpiredDate.getTime() - dateOFEntrance.getTime();

        long daysUntilExpired = differenceInMilliseconds / millisecondsPerDay;

        return (int) daysUntilExpired;
    }

    @Override
    public boolean isProductExpired() throws ParseException {
        return daysUntilExpiredProduct() <= 5;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", dateOfEntrance='" + super.getDateOfEntrance() + '\'' +
                ", udi='" + super.getUdi() + '\'' +
                ", expireDate='" + super.getExpireDate() + '\'' +
                '}';
    }
    @Override
    public String toCsv() {
        return getName()+DELIMITATOR +getPrice()+DELIMITATOR+getDateOfEntrance()+DELIMITATOR+getUdi()+
                DELIMITATOR+getExpireDate();
    }
}
