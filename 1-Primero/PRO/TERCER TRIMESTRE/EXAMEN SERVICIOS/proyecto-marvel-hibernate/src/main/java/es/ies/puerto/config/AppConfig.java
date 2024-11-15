package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String url;



    public String getUrl() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.properties")) {
            properties.load(fis);
            url = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }



}
