package model.impl;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuidadoPersonalTest {
    
    CuidadoPersonal cuidadoPersonal = new CuidadoPersonal();

    @BeforeEach
    public void beforeEach(){
        cuidadoPersonal = new CuidadoPersonal("Champú",3.99f,"2024-02-09",
                "CUI001", 7);
    }

    @Test
    public void cuidadoPersonalGetSetTest() {
        String nameUpdate = "nameUpdate";
        float priceUpdate = 1f;
        String dateOfEntranceUpdate = "2024-01-19";
        String udiUpdate = "udiUpdate";
        int popularityUpdate = 1;
        cuidadoPersonal.setName(nameUpdate);
        cuidadoPersonal.setUdi(udiUpdate);
        cuidadoPersonal.setDateOfEntrance(dateOfEntranceUpdate);
        cuidadoPersonal.setPrice(priceUpdate);
        cuidadoPersonal.setPopularity(popularityUpdate);

        Assertions.assertEquals(nameUpdate, cuidadoPersonal.getName(), "Expected result not found");
        Assertions.assertEquals(priceUpdate, cuidadoPersonal.getPrice(), "Expected result not found");
        Assertions.assertEquals(dateOfEntranceUpdate, cuidadoPersonal.getDateOfEntrance(), "Expected result not found");
        Assertions.assertEquals(udiUpdate, cuidadoPersonal.getUdi(), "Expected result not found");
        Assertions.assertEquals(popularityUpdate, cuidadoPersonal.getPopularity(), "Expected result not found");
    }

    @Test
    public void maxPriceTest(){
        float result = 3.99f*1.8f;
        Assertions.assertEquals(result, cuidadoPersonal.maxPrice(), "Expected result not found");
    }

    @Test
    public void availableQuantityTest(){
        Assertions.assertEquals(0, cuidadoPersonal.availableQuantity(), "Expected result not found");
    }

    @Test
    public void calculatePopularityTest(){
        Assertions.assertEquals(cuidadoPersonal.getPopularity(), cuidadoPersonal.calculatePopularity(),
                "Expected result not found");
    }
    @Test
    public void recommendProductTrueTest(){
        Assertions.assertTrue(cuidadoPersonal.recommendProduct(), "Expected result not found");
    }

    @Test
    public void recommendProductFalseTest(){
        cuidadoPersonal.setPopularity(4);
        Assertions.assertFalse(cuidadoPersonal.recommendProduct(), "Expected result not found");
    }
    @Test
    public void toStringTest(){
        Assertions.assertTrue(cuidadoPersonal.toString().contains(cuidadoPersonal.getUdi()),
                "Expected result not found");
        Assertions.assertTrue(cuidadoPersonal.toString().contains(cuidadoPersonal.getName()),
                "Expected result not found");
        Assertions.assertTrue(cuidadoPersonal.toString().contains(cuidadoPersonal.getDateOfEntrance()),
                "Expected result not found");
        Assertions.assertTrue(cuidadoPersonal.toString().contains(Float.toString(cuidadoPersonal.getPrice())),
                "Expected result not found");
        Assertions.assertTrue(cuidadoPersonal.toString().contains(String.valueOf(cuidadoPersonal.getPopularity())),
                "Expected result not found");
    }

    @Test
    public void toCSVTest(){
        String result = "Champú,3.99,2024-02-09,CUI001,7";
        Assertions.assertEquals(result, cuidadoPersonal.toCsv(), "Expected result not found");
    }
}
