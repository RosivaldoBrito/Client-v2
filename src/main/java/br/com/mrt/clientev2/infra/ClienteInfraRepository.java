package br.com.mrt.clientev2.infra;

import br.com.mrt.clientev2.application.repository.ClienteRepository;
import br.com.mrt.clientev2.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva ");
        Cliente salvaCliente = jpaRepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva ");
        return null;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        var clientes = jpaRepository.findAll();
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return clientes;
    }

    @Override
    public Cliente buscaPorId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - buscaPorID");

        log.info("[finaliza] ClienteInfraRepository - buscaPorID");
        return null;
    }
}
