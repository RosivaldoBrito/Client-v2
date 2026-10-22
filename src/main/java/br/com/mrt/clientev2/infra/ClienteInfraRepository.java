package br.com.mrt.clientev2.infra;

import br.com.mrt.clientev2.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJpaRepository jpaRepository;
}
