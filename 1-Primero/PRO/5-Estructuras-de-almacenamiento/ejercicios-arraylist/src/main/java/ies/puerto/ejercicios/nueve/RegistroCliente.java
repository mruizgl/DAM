package ies.puerto.ejercicios.nueve;

import java.util.ArrayList;
import java.util.List;

public class RegistroCliente {
    List<Cliente> clientes;
    public RegistroCliente() {
        clientes = new ArrayList<>();
    }
    public RegistroCliente(List<Cliente> clientes) {
        this.clientes = new ArrayList<>();
    }

    public Cliente buscarCliente(Cliente cliente) {
        for (Cliente clientelista: clientes) {
            if (cliente.equals(clientelista)){
                return clientelista;
            }
        }
        return null;
    }
    public Cliente buscarCliente(String numeroCliente) {
        Cliente clienteBuscar = new Cliente("", numeroCliente);

        return buscarCliente(clienteBuscar);
    }

    public void addCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void transaccion(String numeroCliente, float cantidad) {
        Cliente clienteActualizar = new Cliente(numeroCliente);
        if (!clientes.contains(clienteActualizar)) {
            return;
        }

        int posicionCliente = clientes.indexOf(clienteActualizar);
        clienteActualizar = buscarCliente(clienteActualizar);
        clientes.add(posicionCliente, clienteActualizar);
        clientes.set(posicionCliente, clienteActualizar);
    }
}
