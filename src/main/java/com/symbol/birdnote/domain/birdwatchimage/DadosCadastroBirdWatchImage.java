package com.symbol.birdnote.domain.birdwatchimage;

import com.symbol.birdnote.domain.birdwatch.DadosCadastroBirdWatch;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DadosCadastroBirdWatchImage(


        String latitude,

        String longitude,

        LocalDateTime data_criacao,

        DadosCadastroBirdWatch birdWatch) {
}
