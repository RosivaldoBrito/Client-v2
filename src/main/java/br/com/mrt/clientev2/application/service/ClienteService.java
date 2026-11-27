package br.com.mrt.clientev2.application.service;

import br.com.mrt.clientev2.application.api.ClienteRequest;
import br.com.mrt.clientev2.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);
}
