package com.symbol.birdnote.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroBirdWatch(

        @NotBlank
        String nome,

        @NotBlank
        String regiao,

        @NotBlank
        String comportamento,

        @NotBlank
        String Estacao,

        @NotNull
        DadosCadastroUsuario usuario,

        @NotNull
        DadosCadastroBird bird
) {
}
