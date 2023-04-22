package com.symbol.birdnote.service;

import com.symbol.birdnote.dto.usuario.UsuarioDTO;
import com.symbol.birdnote.entity.Usuario;
import com.symbol.birdnote.exception.BadRequestException;
import com.symbol.birdnote.repository.UsuarioRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public UsuarioDTO add(UsuarioDTO usuarioDTO) {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<UsuarioDTO>> violations = validator.validate(usuarioDTO);
        if (!violations.isEmpty()) {
            String msg = violations.stream()
                    .map(cons -> String.format("%s: %s", cons.getPropertyPath(), cons.getMessage()))
                    .collect(Collectors.joining(","));

            throw new BadRequestException(msg);
        }

        Usuario usuario = Usuario.builder()
                .nome(usuarioDTO.getNome())
                .login(usuarioDTO.getLogin())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .idade(usuarioDTO.getIdade()).build();

        Usuario newUsuario = usuarioRepo.save(usuario);

        return UsuarioDTO.builder()
                .id(newUsuario.getIdUsuario())
                .nome(newUsuario.getNome())
                .login(newUsuario.getLogin())
                .email(newUsuario.getEmail())
                .senha(newUsuario.getSenha())
                .idade(newUsuario.getIdade()).build();
    }
}
