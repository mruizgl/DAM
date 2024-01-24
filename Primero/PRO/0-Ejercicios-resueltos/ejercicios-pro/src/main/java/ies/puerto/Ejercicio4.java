package ies.puerto;

/**
 * @author Melissa
 */
public class Ejercicio4 {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        saldo = saldo;
    }


    Ejercicio4 cuentaBanco;

    /**
     * Constructor por defecto
     */
    public Ejercicio4() {};

    /**
     * Constructor con todos los parametros
     * @param titular de la cuenta del banco
     * @param saldo de la cuenta del banco
     */
    public Ejercicio4(String titular, double saldo) {
        this.titular = titular;
        saldo = saldo;
    }

    /**
     * Funcion que permite imprimir información del usuario
     * @return devuelve resultado
     */
    public String imprimirInformacion () {
        return "El usuario es: " + titular + " y su saldo actual es de: " + saldo;
    }

    /**
     * Funcion para depositar saldo en la cuenta bancaria
     * @param deposito de la cuenta bancaria
     * @return devuelve resultado
     */
    public boolean depositar (double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            return true;
        }
        return false;
    }

    /**
     * FUncion para retirar efectivo
     * @param saldo saldo de la cuenta
     * @return devuelve el nuevo saldo de la cuenta
     */
    public boolean retirar (double saldo) {
        if ((this.saldo -saldo) > 0) {
            this.saldo -= saldo;
            return true;
        }
        return false;
    }


}
