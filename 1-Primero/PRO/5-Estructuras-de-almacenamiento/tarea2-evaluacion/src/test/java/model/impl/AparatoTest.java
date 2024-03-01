package model.impl;

import es.ies.puerto.modelo.impl.Aparato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class AparatoTest {
    Aparato aparato = new Aparato();

    @BeforeEach
    public void beforeEach(){
        aparato = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
    }

    @Test
    public void aparatoGetSetTest() {
        String nameUpdate = "nameUpdate";
        float priceUpdate = 1f;
        String dateOfEntranceUpdate = "2024-01-19";
        String udiUpdate = "udiUpdate";
        aparato.setName(nameUpdate);
        aparato.setUdi(udiUpdate);
        aparato.setDateOfEntrance(dateOfEntranceUpdate);
        aparato.setPrice(priceUpdate);

        Assertions.assertEquals(nameUpdate, aparato.getName(), "Expected result not found");
        Assertions.assertEquals(priceUpdate, aparato.getPrice(), "Expected result not found");
        Assertions.assertEquals(dateOfEntranceUpdate, aparato.getDateOfEntrance(), "Expected result not found");
        Assertions.assertEquals(udiUpdate, aparato.getUdi(), "Expected result not found");
    }
    @Test
    public void maxPriceTest(){
        float result = 499.99f*1.42f;
        Assertions.assertEquals(result, aparato.maxPrice(), "Expected result not found");
    }

    @Test
    public void availableQuantityTest(){
        Assertions.assertEquals(0, aparato.availableQuantity(), "Expected result not found");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(aparato.toString().contains(aparato.getUdi()), "Expected result not found");
        Assertions.assertTrue(aparato.toString().contains(aparato.getName()), "Expected result not found");
        Assertions.assertTrue(aparato.toString().contains(aparato.getDateOfEntrance()),
                "Expected result not found");
        Assertions.assertTrue(aparato.toString().contains(Float.toString(aparato.getPrice())),
                "Expected result not found");
    }

    @Test
    public void toCSVTest(){
        String result = "Televisor LED,499.99,2024-02-09,APA001";
        Assertions.assertEquals(result, aparato.toCsv(), "Expected result not found");
    }
}
