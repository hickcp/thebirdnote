package com.symbol.birdnote.domain.birdwatch;

import com.symbol.birdnote.domain.bird.Bird;
import com.symbol.birdnote.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "idBirdWatch")
@Entity(name = "birdwatch")
@Table(name = "BIRD_WATCH")
public class BirdWatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBirdWatch;
    private String nome;
    private String regiao;
    private String comportamento;
    private String estacao;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idBird")
    private Bird bird;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
