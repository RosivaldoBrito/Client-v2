package br.com.mrt.clientev2.application.service;

import br.com.mrt.clientev2.application.api.ClienteDetalhadoResponse;
import br.com.mrt.clientev2.application.api.ClienteListResponse;
import br.com.mrt.clientev2.application.api.ClienteRequest;
import br.com.mrt.clientev2.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> listaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);
}
