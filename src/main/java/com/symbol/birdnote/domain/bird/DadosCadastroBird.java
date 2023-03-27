package com.symbol.birdnote.domain.bird;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroBird(

        @NotBlank
        String nomeCientifico
) {
}
