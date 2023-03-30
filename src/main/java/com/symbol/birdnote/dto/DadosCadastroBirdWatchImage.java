package com.symbol.birdnote.dto;

import com.symbol.birdnote.dto.DadosCadastroBirdWatch;

import java.time.LocalDateTime;

public record DadosCadastroBirdWatchImage(


        String latitude,

        String longitude,

        LocalDateTime data_criacao,

        DadosCadastroBirdWatch birdWatch) {
}
