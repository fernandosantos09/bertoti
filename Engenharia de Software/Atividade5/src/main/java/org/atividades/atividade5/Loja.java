package org.atividades.atividade5;

import java.util.LinkedList;
import java.util.List;

public class Loja {

    private List<Cliente> clientes = new LinkedList<Cliente>();

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cliente> buscarClienteNome(String nome) {
        List<Cliente> encontrados = new LinkedList<Cliente>();

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome))
                encontrados.add(cliente);
        }

        return encontrados;
    }
}