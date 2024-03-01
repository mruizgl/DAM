package es.ies.puerto.modelo.fichero.csv.implementation;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.abstracts.FicheroAbstract;
import es.ies.puerto.modelo.fichero.interfaces.IFichero;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSV extends FicheroAbstract implements IFichero {

    public  FileCSV (){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";
    }

    public List<ProductoAbstracts> obtainAlimentos(){
        return read(FICHERO_ALIMENTOS, "alimento");
    }
    public List<ProductoAbstracts> obtainAparatos(){
        return read(FICHERO_APARATOS, "aparato");
    }
    public List<ProductoAbstracts> obtainSouvenirs(){
        return read(FICHERO_SOUVENIRS, "souvenir");
    }
    public List<ProductoAbstracts> obtainCuidadosPersonales(){
        return read(FICHERO_CUIDADO_PERSONAL, "cuidado");
    }
    @Override
    public List<ProductoAbstracts> read(String path, String product) {
        List<ProductoAbstracts>  productoAbstractsList = new ArrayList<>();
        if (fileExist(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElement = linea.split(",");
                        switch (product) {
                            case "alimento":
                                productoAbstractsList.add(splitToAlimento(arrayElement));
                                break;
                            case "cuidado":
                                productoAbstractsList.add(splitToCuidadoPersonal(arrayElement));
                                break;
                            case "souvenir":
                                productoAbstractsList.add(splitToSouvenir(arrayElement));
                                break;
                            default:
                                productoAbstractsList.add(splitToDefault(arrayElement)) ;
                                break;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist or is not valid.");
        }
        return productoAbstractsList;
    }

    @Override
    public boolean reading(String path, String contenido) {
        return saveInFile(path,contenido);
    }
    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2],
                splitArray[3], splitArray[4]);
        return alimento;
    }
    private Aparato splitToDefault(String[] splitArray) {
        Aparato aparato = new Aparato(splitArray[0],
               Float.parseFloat(splitArray[1]), splitArray[2], splitArray[3]);
        return aparato;
    }

    private Souvenir splitToSouvenir(String[] splitArray) {
        Souvenir souvenir = new Souvenir(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2], splitArray[3]);
        return souvenir;
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2],
                splitArray[3], Integer.parseInt(splitArray[4]));
        return cuidadoPersonal;
    }
}
