package es.ies.puerto.config;

import java.io.FileInputStream;
import java.util.Properties;

import es.ies.puerto.exception.TiendaException;

public class AppConfig {
    String url;

    public AppConfig () throws TiendaException{
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/app.properties");
            properties.load(fis);
            url= properties.getProperty("nameBd");
        } catch (Exception e) {
            throw new TiendaException("No se puede establecer conecxion con la base de datos");
        }
    }
    public String getUrl(){
        return url;
    }
}
