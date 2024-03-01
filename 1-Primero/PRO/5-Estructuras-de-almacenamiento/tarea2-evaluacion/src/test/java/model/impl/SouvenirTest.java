package model.impl;
import es.ies.puerto.modelo.impl.Souvenir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SouvenirTest {
    
    Souvenir souvenir = new Souvenir();

    @BeforeEach
    public void beforeEach(){
        souvenir = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");
    }

    @Test
    public void souvenirGetSetTest() {
        String nameUpdate = "nameUpdate";
        float priceUpdate = 1f;
        String dateOfEntranceUpdate = "2024-01-19";
        String udiUpdate = "udiUpdate";
        souvenir.setName(nameUpdate);
        souvenir.setUdi(udiUpdate);
        souvenir.setDateOfEntrance(dateOfEntranceUpdate);
        souvenir.setPrice(priceUpdate);

        Assertions.assertEquals(nameUpdate, souvenir.getName(), "Expected result not found");
        Assertions.assertEquals(priceUpdate, souvenir.getPrice(), "Expected result not found");
        Assertions.assertEquals(dateOfEntranceUpdate, souvenir.getDateOfEntrance(), "Expected result not found");
        Assertions.assertEquals(udiUpdate, souvenir.getUdi(), "Expected result not found");
    }
    @Test
    public void maxPriceTest(){
        float result = 1.99f*1.3f;
        Assertions.assertEquals(result, souvenir.maxPrice(), "Expected result not found");
    }

    @Test
    public void availableQuantityTest(){
        Assertions.assertEquals(0, souvenir.availableQuantity(), "Expected result not found");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(souvenir.toString().contains(souvenir.getUdi()), "Expected result not found");
        Assertions.assertTrue(souvenir.toString().contains(souvenir.getName()), "Expected result not found");
        Assertions.assertTrue(souvenir.toString().contains(souvenir.getDateOfEntrance()),
                "Expected result not found");
        Assertions.assertTrue(souvenir.toString().contains(Float.toString(souvenir.getPrice())),
                "Expected result not found");
    }

    @Test
    public void toCSVTest(){
        String result = "Imán de nevera,1.99,2024-02-09,SOU001";
        Assertions.assertEquals(result, souvenir.toCsv(), "Expected result not found");
    }
}
