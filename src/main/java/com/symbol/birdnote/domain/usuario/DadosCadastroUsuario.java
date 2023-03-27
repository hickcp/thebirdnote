package com.symbol.birdnote.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotBlank
        String login,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha,

        @NotNull
        int idade) {
}
