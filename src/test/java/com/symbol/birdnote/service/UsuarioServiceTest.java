package com.symbol.birdnote.service;

import com.symbol.birdnote.dto.usuario.UsuarioDTO;
import com.symbol.birdnote.entity.Usuario;
import com.symbol.birdnote.exception.BadRequestException;
import com.symbol.birdnote.repository.UsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @InjectMocks
    private UsuarioService usuarioSvc;

    @Mock
    private UsuarioRepository usuarioRepo;

    @Test
    public void addTest() {

        Usuario mockUsuario = Usuario.builder()
                .idUsuario(1l)
                .nome("Rafael Kiyota")
                .login("rafakiyota")
                .email("rfkiyota@gmail.com")
                .senha("java>nodejs")
                .idade(41).build();
        Mockito.when(usuarioRepo.save(Mockito.any(Usuario.class))).thenReturn(mockUsuario);

        UsuarioDTO request = UsuarioDTO.builder()
                .nome("Rafael Kiyota")
                .login("rafakiyota")
                .email("rfkiyota@gmail.com")
                .senha("java>nodejs")
                .idade(41).build();

        UsuarioDTO response = usuarioSvc.add(request);

        Assertions.assertEquals(1l, response.getId());
        Assertions.assertEquals("Rafael Kiyota", response.getNome());
        Assertions.assertEquals("rafakiyota", response.getLogin());
        Assertions.assertEquals("rfkiyota@gmail.com", response.getEmail());
        Assertions.assertEquals("java>nodejs", response.getSenha());
        Assertions.assertEquals(41, response.getIdade());
    }

    @Test
    public void addBadRequestExceptionTest() {

        UsuarioDTO request = UsuarioDTO.builder()
                .nome("Rafael Kiyota")
                .email("rfkiyota@gmail.com")
                .idade(41).build();

        BadRequestException exception = Assertions.assertThrows(BadRequestException.class, () -> usuarioSvc.add(request));
    }
}
