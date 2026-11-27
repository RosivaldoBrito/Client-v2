package br.com.mrt.clientev2.application.service;

import br.com.mrt.clientev2.application.api.ClienteListResponse;
import br.com.mrt.clientev2.application.api.ClienteRequest;
import br.com.mrt.clientev2.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> listaTodosClientes();
}
