package ies.puerto;

/**
 * @author Melissa Ruiz
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    /**
     * Constructor por defecto
     */
    public CuentaBancaria() {}
    /**
     * Constructor con todos los parámetros
     * @param numeroCuenta de la cuenta bancaria
     * @param nombreTitular de la cuenta bancaria
     * @param saldoInicial de la cuenta bancaria
     */
    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    /**
     * Funcion para hacer depositos en la cuenta
     * @param monto de la cuenta bancaria
     * @return devuelve resultado
     */
    public String realizarDeposito(double monto) {
        if (monto > 0) {
            saldo += monto;
            return "Depósito de " + monto + "€ realizado con éxito. Nuevo saldo: " + saldo + "€";
        } else {
            return "Error: El monto del depósito debe ser mayor que cero.";
        }
    }

    /**
     * Funcion para sacar dinero
     * @param monto del dinero que se saca
     * @return devuelve resultado
     */
    public String realizarRetiro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return "Retiro de " + monto + "€ realizado con éxito. Nuevo saldo: " + saldo + "€";
        } else {
            return "Error: Monto de retiro inválido o saldo insuficdiente.";
        }
    }

    /**
     * Funcion para mostrar el saldo
     * @return devuelve resultado
     */
    public String mostrarSaldo() {

        return "Saldo actual de la cuenta " + numeroCuenta + ": €" + saldo;
    }
}