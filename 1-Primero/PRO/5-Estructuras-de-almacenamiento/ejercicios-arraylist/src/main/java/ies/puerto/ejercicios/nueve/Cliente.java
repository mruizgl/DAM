package ies.puerto.ejercicios.nueve;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String numero;
    private float saldo;

    public Cliente(String nombre, String numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cliente(String nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public Cliente(String numeroCliente) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(numero, cliente.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo;
    }
}
