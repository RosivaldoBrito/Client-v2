package br.com.mrt.clientev2.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class ClienteResponse {
    private UUID idCliente;
}
