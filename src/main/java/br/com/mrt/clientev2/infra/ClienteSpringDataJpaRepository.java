package br.com.mrt.clientev2.infra;

import br.com.mrt.clientev2.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
