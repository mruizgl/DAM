package es.ies.puerto.negocio;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.CuidadoPersonal;

import java.text.ParseException;
import java.util.*;

public class TiendaNegocio {
    FileCSV fileCSV;
    private List<ProductoAbstracts> productoAbstractsList;
    private Set<ProductoAbstracts> alimentoList ;
    private List<ProductoAbstracts> aparatoList;
    private Map<String, ProductoAbstracts> souvenirHashMap;
    private List<ProductoAbstracts> cuidadoPersonalList;

    /**
     * Constructors of the class
     */
    public TiendaNegocio(){
        this.fileCSV = new FileCSV();
        this.productoAbstractsList = new ArrayList<>();
        this.alimentoList = new HashSet<>();
        this.aparatoList=new ArrayList<>();
        this.souvenirHashMap=new HashMap<>();
        this.cuidadoPersonalList=new ArrayList<>();
    }

    public TiendaNegocio(FileCSV fileCSV, List<ProductoAbstracts> productoAbstractsList, Set<ProductoAbstracts>
            alimentoList, List<ProductoAbstracts> aparatoList, HashMap<String, ProductoAbstracts> souvenirHashMap,
                         List<ProductoAbstracts> cuidadoPersonalList) {

        this.fileCSV = fileCSV;
        this.productoAbstractsList = productoAbstractsList;
        this.alimentoList = alimentoList;
        this.aparatoList = aparatoList;
        this.souvenirHashMap = souvenirHashMap;
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Getters and setters
     */

    public FileCSV getFileCSV() {
        return fileCSV;
    }

    public void setFileCSV(FileCSV fileCSV) {
        this.fileCSV = fileCSV;
    }

    public List<ProductoAbstracts> getProductoAbstractsList() {
        return productoAbstractsList;
    }

    public void setProductoAbstractsList(List<ProductoAbstracts> productoAbstractsList) {
        this.productoAbstractsList = productoAbstractsList;
    }

    public Set<ProductoAbstracts> getAlimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(Set<ProductoAbstracts> alimentoList) {
        this.alimentoList = alimentoList;
    }

    public List<ProductoAbstracts> getAparatoList() {
        return aparatoList;
    }

    public void setAparatoList(List<ProductoAbstracts> aparatoList) {
        this.aparatoList = aparatoList;
    }

    public Map<String, ProductoAbstracts> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public void setSouvenirHashMap(HashMap<String, ProductoAbstracts> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
    }

    public List<ProductoAbstracts> getCuidadoPersonalList() {
        return cuidadoPersonalList;
    }

    public void setCuidadoPersonalList(List<ProductoAbstracts> cuidadoPersonalList) {
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "TiendaNegocio{" +
                "fileCSV=" + fileCSV +
                ", productoAbstractsList=" + productoAbstractsList +
                ", alimentoList=" + alimentoList +
                ", aparatoList=" + aparatoList +
                ", souvenirHashMap=" + souvenirHashMap +
                ", cuidadoPersonalList=" + cuidadoPersonalList +
                '}';
    }

    /**
     * Method to obtain the full list of food products
     * @return the full list of food (Alimento)
     */

    public Set<ProductoAbstracts> obstenerListaAlimentos() {
        return new HashSet<>(fileCSV.obtainAlimentos());
    }
    /**
     * Method to obtain the full list of objects products
     * @return the full list of objects (Aparato)
     */
    public List<ProductoAbstracts> obtenerListaAparatos() {
        return new ArrayList<>(fileCSV.obtainAparatos());
    }
    /**
     * Method to obtain the full list of self-care products
     * @return the full list of self-care (CuidadoPersonal)
     */
    public List<ProductoAbstracts> obtenerListaCuidadosPersonales() {
        return new ArrayList<>(fileCSV.obtainCuidadosPersonales());
    }
    /**
     * Method to obtain the full list of souvenirs products
     * @return the full list of souvenirs (Souvenir)
     */
    public Map<String, ProductoAbstracts> obtenerListaSouvenir() {
        List<ProductoAbstracts> souvernirList = fileCSV.obtainSouvenirs();
        Map<String, ProductoAbstracts> souvenirHashMap = new HashMap<>();

        for (ProductoAbstracts productoAbstracts : souvernirList){
            souvenirHashMap.put(productoAbstracts.getUdi(), productoAbstracts);
        }
        return souvenirHashMap;
    }

    /**
     * Method to obtain the full list of products
     * @return the full list of products
     */
    public List<ProductoAbstracts> obtenerProductos() {
        List<ProductoAbstracts> allProductsList = new ArrayList<>();
        allProductsList.addAll(obstenerListaAlimentos());
        allProductsList.addAll(obtenerListaAparatos());
        allProductsList.addAll(obtenerListaCuidadosPersonales());
        allProductsList.addAll(obtenerListaSouvenir().values());
        return allProductsList;
    }

    /**
     * Method to obtain a certain product
     * @param udi to search in the list
     * @return the product if it exists, null if not
     */
    public  ProductoAbstracts obtenerProductoUDI(String udi) {
        for (ProductoAbstracts productoAbstracts : obtenerProductos()) {
            if (productoAbstracts.getUdi().equals(udi)) {
                return productoAbstracts;
            }
        }
        return null;
    }

    /**
     * Method to add a product to the list
     * @param productoAbstracts to add
     * @return true if product added, false if the list did contain the product
     */
    public boolean addProducts(ProductoAbstracts productoAbstracts){
        if (obtenerProductos().contains(productoAbstracts)){
            return true;
        }
        return obtenerProductos().add(productoAbstracts);
    }

    /**
     * Method to remove a product of the list
     * @param productoAbstracts to remove
     * @return true if product is removed, false if list is null or product does not exist in it
     */
    public boolean removeProducts(ProductoAbstracts productoAbstracts){
        if (!productoAbstractsList.contains(productoAbstracts)){
            return false;
        }
        return productoAbstractsList.remove(productoAbstracts);
    }

    /**
     * Method to calculate the total price of each type of products
     * @return a list of floats with the total price of each type of products
     */
    public List<Float> precioTotalProductos() throws ParseException {
        return new ArrayList<>(Arrays.asList(precioTotalAlimentos(), precioTotalAparatos(),
                precioTotalCuidadoPersonal(), precioTotalSouvenirs()));
    }

    /**
     * Method to calculate the total price of products of food type (Alimento)
     * @return a float with the total price of each
     */
    public Float precioTotalAlimentos() throws ParseException {
        float sum = 0f;
            for (ProductoAbstracts productoAbstracts : obstenerListaAlimentos()){
                Alimento alimento = (Alimento) productoAbstracts;
                if (!alimento.isProductExpired()){
                    sum += alimento.maxPrice();
                }
            }
        return sum;
    }

    /**
     * Method to calculate the total price of products of objects type (Aparato)
     * @return a float with the total price of each
     */
    public Float precioTotalAparatos(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtenerListaAparatos()){
            sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total price of products of self-care type (CuidadoPersonal)
     * @return a float with the total price of each
     */
    public Float precioTotalCuidadoPersonal(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtenerListaCuidadosPersonales()){
            sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total price of products of souvenirs type (Souvenir)
     * @return a float with the total price of each
     */
    public Float precioTotalSouvenirs() {
        float sum = 0f;

        for (ProductoAbstracts productoAbstracts : obtenerListaSouvenir().values()) {
                sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total earning of the shop
     * @return a float with the total
     */
        public float totalGanancias() throws ParseException {
            return gananciasAlimentos()+ gananciasSouvenir()+ gananciasAparatos()+ gananciasCuidadoPersonal();
        }

    /**
     * Method to calculate the total earning of the food
     * @return a float with the total
     */
    public float gananciasAlimentos() throws ParseException {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obstenerListaAlimentos()){
            Alimento alimento = (Alimento) productoAbstracts;
            if (!alimento.isProductExpired()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
            }
        }
        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the items
     * @return a float with the total
     */
    public float gananciasAparatos() {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtenerListaAparatos()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }

        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the souvenirs
     * @return a float with the total
     */
    public float gananciasSouvenir() {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtenerListaSouvenir().values()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }

        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the self-care items
     * @return a float with the total
     */
    public float gananciasCuidadoPersonal() {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtenerListaCuidadosPersonales()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }
        return sumEarning - sumNormal;
    }
    /**
     * Method to show the self-care items with a popularity if 7 or more
     * @return a list with the items that meet that conditions
     */
    public List<ProductoAbstracts> popularidad() {
            List<ProductoAbstracts> popularItems = new ArrayList<>();
        for (ProductoAbstracts productoAbstracts : obtenerListaCuidadosPersonales()){
            CuidadoPersonal cuidadoPersonal = (CuidadoPersonal) productoAbstracts;
            if (cuidadoPersonal.recommendProduct()){
                popularItems.add(cuidadoPersonal);
            }
        }
        return popularItems;
    }

    /**
     * Method to show the available products of each type
     * @return a list with the products
     * @throws ParseException if the food's expiration date does not meet the format
     */
    public List<ProductoAbstracts> mostrarProductosDisponibles() throws ParseException {
        List<ProductoAbstracts> availableProducts = new ArrayList<>();
        for (ProductoAbstracts productoAbstracts: obstenerListaAlimentos()){
            Alimento alimento = (Alimento) productoAbstracts;
            if (!alimento.isProductExpired()){
                availableProducts.add(alimento);
            }
        }
        availableProducts.addAll(obtenerListaAparatos());
        availableProducts.addAll(obtenerListaCuidadosPersonales());
        availableProducts.addAll(obtenerListaSouvenir().values());
        return availableProducts;
    }

    /**
     * Method to obtain the size of the list of food
     * @return the size of the list
     */
    public int lengthAlimentoList(){
        return obstenerListaAlimentos().size();
    }

    /**
     * Method to obtain the size of the list of items
     * @return the size of the list
     */
    public int lengthAparatosList(){
        return obtenerListaAparatos().size();
    }
    /**
     * Method to obtain the size of the list of souvenirs
     * @return the size of the list
     */
    public int lengthSouvenirsList(){
        return obtenerListaSouvenir().size();
    }
    /**
     * Method to obtain the size of the list of self-care items
     * @return the size of the list
     */
    public int lengthCuidadosList(){
        return obtenerListaCuidadosPersonales().size();
    }
    /**
     * Method to obtain the size of the list of products
     * @return the size of the list
     */
    public int lengthAllProductsList(){
        return obtenerProductos().size();
    }
}
