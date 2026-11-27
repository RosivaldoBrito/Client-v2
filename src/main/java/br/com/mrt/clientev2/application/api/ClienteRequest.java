package br.com.mrt.clientev2.application.api;


import br.com.mrt.clientev2.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteRequest {

    @NotBlank
    @NotNull
    @Size(min=10)
    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotNull
    @NotBlank
    private String email;
    @Size(min = 10, max = 13)
    private String telefone;
    @NotNull
    private Sexo sexo;
    @NotNull
    private String celular;
    @NotNull
    private LocalDate dataNascimento;
}
