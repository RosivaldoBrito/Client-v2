package br.com.mrt.clientev2.application.repository;

import br.com.mrt.clientev2.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
