package com.symbol.birdnote.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroBird(

        @NotBlank
        String nomeCientifico
) {
}
