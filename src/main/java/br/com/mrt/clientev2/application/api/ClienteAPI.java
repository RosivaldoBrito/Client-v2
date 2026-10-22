package br.com.mrt.clientev2.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ClienteResponse postCadrastaNovoCliente(ClienteRequest clienteRequest);

}
