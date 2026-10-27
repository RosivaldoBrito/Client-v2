package br.com.mrt.clientev2.application.api;

import br.com.mrt.clientev2.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCadrastaNovoCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteRestController - postCadrastaNovoCliente");

        log.info("[finaliza] ClienteRestController - postCadrastaNovoCliente");
         return null;
    }
}
