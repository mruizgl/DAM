package model.impl;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.modelo.impl.Alimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.*;

public class AlimentoTest {


    Alimento alimento = new Alimento();

    @BeforeEach
    public void beforeEach(){
        alimento = new Alimento("Manzanas",2.50f,"2024-01-09","ALM001",
                "2024-01-15");
    }

    @Test
    public void alimentoGetSetTest() {
        String nameUpdate = "nameUpdate";
        float priceUpdate = 1f;
        String dateOfEntranceUpdate = "2024-01-19";
        String expirationDateUpdate = "2024-01-19";
        String udiUpdate = "udiUpdate";
        alimento.setName(nameUpdate);
        alimento.setUdi(udiUpdate);
        alimento.setExpireDate(expirationDateUpdate);
        alimento.setDateOfEntrance(dateOfEntranceUpdate);
        alimento.setPrice(priceUpdate);

        Assertions.assertEquals(nameUpdate, alimento.getName(), "Expected result not found");
        Assertions.assertEquals(priceUpdate, alimento.getPrice(), "Expected result not found");
        Assertions.assertEquals(dateOfEntranceUpdate, alimento.getDateOfEntrance(), "Expected result not found");
        Assertions.assertEquals(expirationDateUpdate, alimento.getExpireDate(), "Expected result not found");
        Assertions.assertEquals(udiUpdate, alimento.getUdi(), "Expected result not found");
    }
    @Test
    public void maxPriceTest(){
        float result = 2.50f*1.35f;
        Assertions.assertEquals(result, alimento.maxPrice(), "Expected result not found");
    }


    @Test
    public void availableQuantityTest(){
        Assertions.assertEquals(0, alimento.availableQuantity(), "Expected result not found");
    }
    @Test
    public void daysUntilExpiredProductTest() throws ParseException {
        Assertions.assertEquals(6, alimento.daysUntilExpiredProduct(),"Expected result not found");
    }

    @Test
    public void isProductExpiredFalseTest() throws ParseException {
        Assertions.assertFalse(alimento.isProductExpired(),"Expected result not found");
    }

    @Test
    public void isProductExpiredTrueTest() throws ParseException {
        alimento.setExpireDate("2024-01-10");
        Assertions.assertTrue(alimento.isProductExpired(),"Expected result not found");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(alimento.toString().contains(alimento.getUdi()), "Expected result not found");
        Assertions.assertTrue(alimento.toString().contains(alimento.getName()), "Expected result not found");
        Assertions.assertTrue(alimento.toString().contains(alimento.getDateOfEntrance()),
                "Expected result not found");
        Assertions.assertTrue(alimento.toString().contains(alimento.getExpireDate()),
                "Expected result not found");
        Assertions.assertTrue(alimento.toString().contains(Float.toString(alimento.getPrice())),
                "Expected result not found");
    }

    @Test
    public void toCSVTest(){
        String result = "Manzanas,2.5,2024-01-09,ALM001,2024-01-15";
        Assertions.assertEquals(result, alimento.toCsv(), "Expected result not found");
    }
}
