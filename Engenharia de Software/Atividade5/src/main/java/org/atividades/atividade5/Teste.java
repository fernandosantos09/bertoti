package org.atividades.atividade5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class Teste {

    @Test

    void test() {
        Loja loja = new Loja();

        loja.addCliente(new Cliente("Fernando", "12988904750"));

        assertEquals(loja.getClientes().size(), 1);

        List<Cliente> clientesEncontrados = loja.buscarClienteNome("Fernando");
        assertEquals(clientesEncontrados.get(0).getCpf(), "12988904750");
    }
}