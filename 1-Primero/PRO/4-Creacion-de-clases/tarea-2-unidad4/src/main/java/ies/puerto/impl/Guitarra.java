package ies.puerto.impl;

import ies.puerto.abstrac.InstrumentoMusicalAbstract;
import ies.puerto.interfaz.IInstrumentoMusical;

public class Guitarra extends InstrumentoMusicalAbstract implements IInstrumentoMusical {
    @Override
    public String tocarNota(String nota) {
        return "Guitarra toca la nota " + nota;
    }

    @Override
    public String afinar() {
        return "Guitarra afinada";
    }

    public String cambiarCuerda() {
        return "Se debe cambiar las cuerdas de la guitarra";
    }
}
