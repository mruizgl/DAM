package ies.puerto.implementacion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



public class Tienda {
    

    private ArrayList<Alimento> alimentos;
    private HashMap<String, Aparato> aparatos;
    private HashSet<Souvenir>souvenirs;
    private ArrayList<CuidadoPersonal>cuidadosPersonales;
    /**
     * Constructor pr defecto
     */
    public Tienda() {
        alimentos = new ArrayList<>();
        aparatos =new HashMap<>();
        souvenirs = new HashSet<>();
        cuidadosPersonales= new ArrayList<>();
    }
    /**
     * Constructor con todas las propiedades de la clase
     * @param alimentos
     * @param aparatos
     * @param souvenirs
     * @param cuidadosPersonales
     */
    public Tienda(ArrayList<Alimento> alimentos, HashMap<String, Aparato> aparatos, HashSet<Souvenir> souvenirs,
            ArrayList<CuidadoPersonal> cuidadosPersonales) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.souvenirs = souvenirs;
        this.cuidadosPersonales = cuidadosPersonales;
    }
    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }
    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    public HashMap<String, Aparato> getAparatos() {
        return aparatos;
    }
    public void setAparatos(HashMap<String, Aparato> aparatos) {
        this.aparatos = aparatos;
    }
    public HashSet<Souvenir> getSouvenirs() {
        return souvenirs;
    }
    public void setSouvenirs(HashSet<Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }
    public ArrayList<CuidadoPersonal> getCuidadosPersonales() {
        return cuidadosPersonales;
    }
    public void setCuidadosPersonales(ArrayList<CuidadoPersonal> cuidadosPersonales) {
        this.cuidadosPersonales = cuidadosPersonales;
    }
    public boolean agregarAlimento(Alimento alimento){
        if (alimentos.contains(alimento)) {
            return true;
        }
        alimentos.add(alimento);
        return true;
    }
    public boolean eliminarAlimento(Alimento alimento){
        if (alimentos.contains(alimento)) {
            alimentos.remove(alimento);
            return true;
        }
        return true;
    }
    public Alimento obtenerAlimento(String udi){
        Alimento alimento= new Alimento(udi);
        if (alimentos.contains(alimento)) {
        return alimento;
        }
        return null;
    }
    public boolean agregarSouvenir(Souvenir souvenir){
        if (souvenirs.contains(souvenir)) {
            return true;
        }
        souvenirs.add(souvenir);
        return true;
    }
    public boolean eliminarSouvenir(Souvenir souvenir){
        if (souvenirs.contains(souvenir)) {
            souvenirs.remove(souvenir);
            return true;
        }
        return true;
    }
    public Souvenir obtenerSouvenir(String udi){
        Souvenir souvenir=new Souvenir(udi);
        if (souvenirs.contains(souvenir)) {
            return souvenir;
        }
        return null;
    }
    public boolean agregarAparatos(Aparato aparato, String udi){
        
        if (aparatos.containsKey(udi)) {
                return true;
        }
        aparatos.put(udi,aparato);
        return true;
    }
    public boolean eliminarAparatos(Aparato aparato, String udi){
        
        if (aparatos.containsKey(udi)) {
            aparatos.remove(udi);    
            return true;
        }
        return true;
    }
    public Aparato obtenerAparato(String udi){
        
        if (aparatos.containsKey(udi)) {
            Aparato aparato = aparatos.get(udi);
            return aparato;
        }
        return null;
    }
    public boolean agregarCP(CuidadoPersonal cuidadoPersonal){
        if (cuidadosPersonales.contains(cuidadoPersonal)) {
            return true;
        }
        cuidadosPersonales.add(cuidadoPersonal);
        return true;
    }
    public boolean eliminarCP(CuidadoPersonal cuidadoPersonal){
        if (cuidadosPersonales.contains(cuidadoPersonal)) {
            cuidadosPersonales.remove(cuidadoPersonal);
            return true;
        }
        return true;
    }
    
    public float precioTotalAlimetos(){
        float resultado =0;
        if (alimentos.isEmpty()) {
            return resultado;
        }
        for (Alimento alimento : alimentos) {
            resultado = resultado+(alimento.getPrecio()* alimento.cantidadDisponible());
        }
        return resultado;
    }
    public float preciototalCP(){
        float resultado=0;
        if (cuidadosPersonales.isEmpty()) {
            return resultado;
        }
        for (CuidadoPersonal cuidadoPersonal : cuidadosPersonales) {
            resultado= resultado + (cuidadoPersonal.getPrecio()*cuidadoPersonal.cantidadDisponible());
        }

        return resultado;
    }
    public float preciototalSouvenir(){
        float resultado=0;
        if (souvenirs.isEmpty()) {
            return resultado;
        }
        for (Souvenir souvenir : souvenirs) {
            resultado=resultado+(souvenir.getPrecio()*souvenir.cantidadDisponible());
        }
        return resultado;
    }
    public float preciototalAparato(){
        float resultado=0;
        if (aparatos.isEmpty()) {
            return resultado;
        }
        for (Aparato aparato : aparatos.values()) {
            resultado=resultado+(aparato.getPrecio()*aparato.cantidadDisponible());
        }
        return resultado;
    }
    public float valorTotalTienda(){
        float resultado = preciototalAparato()+preciototalCP()+preciototalSouvenir()+precioTotalAlimetos();
        return resultado;
    }
    
    

}

