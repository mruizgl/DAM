package es.ies.puerto.modelo.fichero.abstracts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FicheroAbstract {

        public String FICHERO_ALIMENTOS= "";
        public  String FICHERO_APARATOS= "";
        public  String FICHERO_CUIDADO_PERSONAL= "";
        public String FICHERO_SOUVENIRS= "";

        public boolean fileExist(String path) {
            if (path == null || path.isEmpty()) {
                return false;
            }
            File fichero = new File(path);
            return fichero.exists() && fichero.isFile();
        }

        public  boolean saveInFile(String path, String texto) {
            if (!fileExist(path)) {
                return false;
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                bw.write(texto);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
}
