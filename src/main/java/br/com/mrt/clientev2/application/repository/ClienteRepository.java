package br.com.mrt.clientev2.application.repository;

import br.com.mrt.clientev2.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosClientes();
}
