package es.ies.puerto.config;

import es.ies.puerto.exception.MarvelException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    public AppConfig() throws MarvelException {
        Properties porperties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/app.properties");
             porperties.load(fis);
             urlBd=porperties.getProperty("urlBd");
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }
    }

    public String getUrlBd() {
        return urlBd;
    }
}
