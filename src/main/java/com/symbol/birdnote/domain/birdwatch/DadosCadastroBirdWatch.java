package com.symbol.birdnote.domain.birdwatch;

import com.symbol.birdnote.domain.bird.Bird;
import com.symbol.birdnote.domain.bird.DadosCadastroBird;
import com.symbol.birdnote.domain.usuario.DadosCadastroUsuario;
import com.symbol.birdnote.domain.usuario.Usuario;
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
