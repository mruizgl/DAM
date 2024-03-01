package negocio;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.*;

public class TiendaNegocioTest {
     TiendaNegocio tiendaNegocio = new TiendaNegocio();
     FileCSV fileCSV = new FileCSV();
     List<ProductoAbstracts> productoAbstractsList = new ArrayList<>();
     Set<ProductoAbstracts> alimentoHashSet;
     List<ProductoAbstracts> aparatoList;
     List<ProductoAbstracts> cuidadoPersonalList;
     HashMap<String, ProductoAbstracts> souvenirHashMap;
    Alimento alimento1 = new Alimento("Manzanas",2.50f,"2024-01-09","ALM001",
            "2024-01-15");
    Alimento alimento2 = new Alimento("Leche",1.99f,"2024-02-09","ALM002",
            "2024-02-14");
    Alimento alimento3 = new Alimento("Arroz",3.75f,"2024-01-15","ALM003",
            "2024-01-27");
    Aparato aparato1 = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
    Aparato aparato2 = new Aparato("Smartphone",799.99f,"2024-02-09","APA002");
    Aparato aparato3 = new Aparato("Cafetera",39.99f,"2024-02-09","APA003");

    Souvenir souvenir1 = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");
    Souvenir souvenir2 = new Souvenir("Llavero",0.99f,"2024-02-09","SOU002");
    Souvenir souvenir3 = new Souvenir("Taza de cafe",3.49f,"2024-02-09","SOU003");

    CuidadoPersonal cuidadoPersonal1 = new CuidadoPersonal("Champú",3.99f,"2024-02-09",
            "CUI001", 7);
    CuidadoPersonal cuidadoPersonal2 = new CuidadoPersonal("Crema hidratante",5.49f,
            "2024-02-09", "CUI002",8);

    CuidadoPersonal cuidadoPersonal3 = new CuidadoPersonal("Cepillo de dientes",2.29f,
            "2024-02-09", "CUI003",6);
    @BeforeEach
    public void beforeEach() {
        alimentoHashSet = new HashSet<>(Arrays.asList(alimento1, alimento2, alimento3));
        aparatoList = new ArrayList<>(Arrays.asList(aparato1, aparato2,aparato3));
        cuidadoPersonalList = new ArrayList<>(Arrays.asList(cuidadoPersonal1, cuidadoPersonal2,cuidadoPersonal3));
        souvenirHashMap = new HashMap<>();
            souvenirHashMap.put(souvenir1.getUdi(),souvenir1);
            souvenirHashMap.put(souvenir2.getUdi(),souvenir2);
            souvenirHashMap.put(souvenir3.getUdi(),souvenir3);

        productoAbstractsList.addAll(alimentoHashSet);
        productoAbstractsList.addAll(aparatoList);
        productoAbstractsList.addAll(cuidadoPersonalList);
        productoAbstractsList.addAll(souvenirHashMap.values());

        tiendaNegocio = new TiendaNegocio(fileCSV, productoAbstractsList,alimentoHashSet,aparatoList,
                souvenirHashMap,cuidadoPersonalList);
    }

    @Test
    public void tiendaNotNullTest(){
        Assertions.assertNotNull(tiendaNegocio, "Class can not be null.");
    }

    @Test
    public void tiendaGetSetTest (){
        FileCSV updatedFileCSV = new FileCSV();
        List<ProductoAbstracts> updatedList = new ArrayList<>();
        Set<ProductoAbstracts> alimentoHashSetUpdated = new HashSet<>();
        List<ProductoAbstracts> aparatoListUpdated = new ArrayList<>();
        List<ProductoAbstracts> cuidadoPersonalListUpdated = new ArrayList<>();
        HashMap<String, ProductoAbstracts> souvenirHashMapUpdated = new HashMap<>();

        tiendaNegocio.setFileCSV(updatedFileCSV);
        tiendaNegocio.setProductoAbstractsList(updatedList);
        tiendaNegocio.setAlimentoList(alimentoHashSetUpdated);
        tiendaNegocio.setAparatoList(aparatoListUpdated);
        tiendaNegocio.setCuidadoPersonalList(cuidadoPersonalListUpdated);
        tiendaNegocio.setSouvenirHashMap(souvenirHashMapUpdated);

        Assertions.assertEquals(updatedFileCSV, tiendaNegocio.getFileCSV(), "Expected result not found");
        Assertions.assertEquals(updatedList, tiendaNegocio.getProductoAbstractsList(),
                "Expected result not found");
        Assertions.assertEquals(alimentoHashSetUpdated, tiendaNegocio.getAlimentoList(),
                "Expected result not found");
        Assertions.assertEquals(aparatoListUpdated, tiendaNegocio.getAparatoList(),
                "Expected result not found");
        Assertions.assertEquals(souvenirHashMapUpdated, tiendaNegocio.getSouvenirHashMap(),
                "Expected result not found");
        Assertions.assertEquals(cuidadoPersonalListUpdated, tiendaNegocio.getCuidadoPersonalList(),
                "Expected result not found");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(tiendaNegocio.toString().contains(fileCSV.toString()), "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(productoAbstractsList.toString()),
                "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(alimentoHashSet.toString()),
                "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(aparatoList.toString()),
                "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(souvenirHashMap.toString()),
                "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(cuidadoPersonalList.toString()),
                "Expected result not found");
    }


    @Test
    public void obtainAlimentosListTest(){
        Assertions.assertEquals(alimentoHashSet, tiendaNegocio.obstenerListaAlimentos(),
                "Expected result not found");
    }
    @Test
    public void obtainAparatosListTest(){
        Assertions.assertEquals(aparatoList, tiendaNegocio.obtenerListaAparatos(),
                "Expected result not found");
    }
    @Test
    public void obtainSouvenirListTest(){
        Assertions.assertEquals(souvenirHashMap, tiendaNegocio.obtenerListaSouvenir(),
                "Expected result not found");
    }
    @Test
    public void obtainCuidadosListTest(){
        Assertions.assertEquals(cuidadoPersonalList, tiendaNegocio.obtenerListaCuidadosPersonales(),
                "Expected result not found");
    }

    @Test
    public void obtainProductsListTest(){
        Assertions.assertEquals(productoAbstractsList, tiendaNegocio.obtenerProductos(),
                "Expected result not found");
    }
    @Test
    public void obtainCertainProductsTest(){

        Assertions.assertEquals(alimento1, tiendaNegocio.obtenerProductoUDI("ALM001"),
                "Expected result not found");
    }

    @Test
    public void obtainCertainProductNotExistTest(){
        Assertions.assertNotEquals(productoAbstractsList, tiendaNegocio.obtenerProductoUDI("ALM007"),
                "Expected result not found");
    }

    @Test
    public void addProductTest(){
        ProductoAbstracts alimento = new Alimento("Leche",1.99f,"2024-02-09","ALM002",
                "2024-02-14");
        ProductoAbstracts aparato = new Aparato("Imán de nevera",1.99f,
                "2024-02-09","SOU012");
        ProductoAbstracts souvenir = new Souvenir("Imán de nevera",1.99f,
                "2024-02-09","SOU014");
        ProductoAbstracts cuidadoPersonal = new CuidadoPersonal("Cepillo de dientes",2.29f,
                "2024-02-09", "CUI003",6);
        tiendaNegocio.addProducts(alimento);
        tiendaNegocio.addProducts(aparato);
        tiendaNegocio.addProducts(souvenir);
        tiendaNegocio.addProducts(cuidadoPersonal);

        Assertions.assertEquals(3, tiendaNegocio.obstenerListaAlimentos().size(),
                "Expected result not found");
        Assertions.assertEquals(3, tiendaNegocio.obtenerListaAparatos().size(),
                "Expected result not found");
        Assertions.assertEquals(3, tiendaNegocio.obtenerListaSouvenir().size(),
                "Expected result not found");
        Assertions.assertEquals(3, tiendaNegocio.obtenerListaCuidadosPersonales().size(),
                "Expected result not found");
        Assertions.assertEquals(12, tiendaNegocio.obtenerProductos().size(),
                "Expected result not found");
    }
    @Test
    public void removeProductTest(){
        Assertions.assertTrue(tiendaNegocio.removeProducts(alimento1), "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.removeProducts(aparato1), "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.removeProducts(souvenir1), "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.removeProducts(cuidadoPersonal1),
                "Expected result not found");

    }
    @Test
    public void removeProductNotExistTest(){
        ProductoAbstracts alimento = new Alimento("Leche",1.99f,"2024-02-09","ALM0076",
                "2024-02-14");
        ProductoAbstracts aparato = new Aparato("Imán de nevera",1.99f,
                "2024-02-09","SOU0162");
        ProductoAbstracts souvenir = new Souvenir("Imán de nevera",1.99f,
                "2024-02-09","SOU0144");
        ProductoAbstracts cuidadoPersonal = new CuidadoPersonal("Cepillo de dientes",2.29f,
                "2024-02-09", "CUI0053",6);

        Assertions.assertFalse(tiendaNegocio.removeProducts(alimento), "Expected result not found");
        Assertions.assertFalse(tiendaNegocio.removeProducts(aparato), "Expected result not found");
        Assertions.assertFalse(tiendaNegocio.removeProducts(souvenir), "Expected result not found");
        Assertions.assertFalse(tiendaNegocio.removeProducts(cuidadoPersonal),
                "Expected result not found");

    }

    @Test
    public void totalPriceAlimentoListTest() throws ParseException {
        float result = 8.4375f;
        Assertions.assertEquals(result, tiendaNegocio.precioTotalAlimentos(), "Expected result not found");
    }

    @Test
    public void totalPriceAparatosListTest(){
        float result = 1902.7572f;
        Assertions.assertEquals(result, tiendaNegocio.precioTotalAparatos(), "Expected result not found");
    }

    @Test
    public void totalPriceSouvenirsListTest(){
        float result = 8.410999f;
        Assertions.assertEquals(result, tiendaNegocio.precioTotalSouvenirs(), "Expected result not found");
    }

    @Test
    public void totalPriceCuidadoListTest(){
        float result = 21.185999f;
        Assertions.assertEquals(result, tiendaNegocio.precioTotalCuidadoPersonal(), "Expected result not found");
    }

    @Test
    public void totalPriceShopTest() throws ParseException {
        List<Float> result = Arrays.asList(8.4375f, 1902.7572f, 21.185999f, 8.410999f);
        Assertions.assertEquals(result, tiendaNegocio.precioTotalProductos(), "Expected result not found");
    }

    @Test
    public void totalEarningAlimentoListTest() throws ParseException {
        float result = 2.1875f;
        Assertions.assertEquals(result, tiendaNegocio.gananciasAlimentos(), "Expected result not found");
    }

    @Test
    public void totalEarningAparatosListTest(){
        float result = 562.78723f;
        Assertions.assertEquals(result, tiendaNegocio.gananciasAparatos(), "Expected result not found");
    }

    @Test
    public void totalEarningSouvenirsListTest(){
        float result = 1.940999f;
        Assertions.assertEquals(result, tiendaNegocio.gananciasSouvenir(), "Expected result not found");
    }

    @Test
    public void totalEarningCuidadoListTest(){
        float result = 9.415999f;
        Assertions.assertEquals(result, tiendaNegocio.gananciasCuidadoPersonal(), "Expected result not found");
    }

    @Test
    public void totalEarningShopTest() throws ParseException {
        float result = 576.3317f;
        Assertions.assertEquals(result, tiendaNegocio.totalGanancias(), "Expected result not found");
    }
    @Test
    public void popularityTest(){
        List<ProductoAbstracts> popularResult = new ArrayList<>(Arrays.asList(cuidadoPersonal1,cuidadoPersonal2));
        Assertions.assertEquals(popularResult, tiendaNegocio.popularidad(), "Expected result not found");
    }
    
    @Test
    public void showAvailableProductsTest() throws ParseException {
        tiendaNegocio.removeProducts(alimento2);
        Assertions.assertEquals(productoAbstractsList, tiendaNegocio.mostrarProductosDisponibles(), "Expected result not found");
    }
    @Test
    public void lengthAlimentoListTest() {
        Assertions.assertEquals(3, tiendaNegocio.lengthAlimentoList(), "Expected result not found");
    }
    @Test
    public void lengthAparatoListTest()  {
        Assertions.assertEquals(3, tiendaNegocio.lengthAparatosList(), "Expected result not found");
    }
    @Test
    public void lengthSouvenirListTest()  {
        Assertions.assertEquals(3, tiendaNegocio.lengthSouvenirsList(), "Expected result not found");
    }
    @Test
    public void lengthCuidadoListTest()  {
        Assertions.assertEquals(3, tiendaNegocio.lengthCuidadosList(), "Expected result not found");
    }
    @Test
    public void lengthAllProductsListTest() {
        Assertions.assertEquals(12, tiendaNegocio.lengthAllProductsList(), "Expected result not found");
    }
}

