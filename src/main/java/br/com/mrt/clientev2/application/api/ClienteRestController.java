package br.com.mrt.clientev2.application.api;

import br.com.mrt.clientev2.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClienteRestController implements ClienteAPI {

    private final ClienteService clienteService;
}
