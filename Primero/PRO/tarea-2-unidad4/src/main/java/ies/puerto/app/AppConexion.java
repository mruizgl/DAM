package ies.puerto.app;

import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWifi;


public class AppConexion {
    static ConexionEthernet ethernet;
    static ConexionWifi wifi;

    public static void main(String[] args) {
        ethernet = new ConexionEthernet();
        wifi = new ConexionWifi();

        System.out.println(ethernet.conectar());
        System.out.println(wifi.conectar());

    }
}
