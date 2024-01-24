package ies.puerto.app;

import ies.puerto.impl.ReproductorMp3;

public class AppReproductor {
    static ReproductorMp3 reproductorMp3;
    public static void main(String[] args) {
        reproductorMp3 = new ReproductorMp3();
        System.out.println(reproductorMp3.reproducir());
        System.out.println(reproductorMp3.detener());
    }
}
