package br.com.mrt.clientev2.application.service;

import br.com.mrt.clientev2.application.api.ClienteRequest;
import br.com.mrt.clientev2.application.api.ClienteResponse;
import br.com.mrt.clientev2.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - cadrastaNovoCliente");
        
        log.info("[finaliza] ClienteApplicationService - cadrastaNovoCliente");
        return null;
    }
}
