package com.symbol.birdnote.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name="USUARIO")
@Entity(name="usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "idUsuario")
@Embeddable
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nome;
    private String login;
    private String email;
    private String senha;
    private int idade;

}
