package es.ies.puerto.modelo.interfaces;

import java.text.ParseException;

public interface ISaludable {
    int daysUntilExpiredProduct () throws ParseException;
    boolean isProductExpired() throws ParseException;

}
