package br.com.mrt.clientev2.application.api;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class ClienteResponse {
    private UUID idCliente;
}
