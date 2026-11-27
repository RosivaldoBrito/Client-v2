package br.com.mrt.clientev2.application.repository;

import br.com.mrt.clientev2.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosClientes();

    Cliente buscaPorId(UUID idCliente);
}
