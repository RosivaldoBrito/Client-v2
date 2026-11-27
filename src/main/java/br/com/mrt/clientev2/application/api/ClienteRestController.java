package br.com.mrt.clientev2.application.api;

import br.com.mrt.clientev2.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCadrastaNovoCliente(@Valid ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteRestController - postCadrastaNovoCliente");
        ClienteResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
        log.info("[finaliza] ClienteRestController - postCadrastaNovoCliente");
         return cliente;
    }

    @Override
    public List<ClienteListResponse> getListaTodosClientes() {
        log.info("[inicia] ClienteRestController - getListaTodosClientes ");
        List<ClienteListResponse> listaCliente = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestController - getListaTodosClientes ");
        return listaCliente;
    }

    @Override
    public ClienteDetalhadoResponse getBuscaClientePorID(UUID idCliente) {
        log.info("[inicia] ClienteRestController - getBuscaClientePorID");

        log.info("[finalizado] ClienteRestController - getBuscaClientePorID");
        return null;
    }
}
