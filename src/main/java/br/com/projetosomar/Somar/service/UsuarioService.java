package br.com.projetosomar.Somar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetosomar.Somar.model.Usuario;
import br.com.projetosomar.Somar.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

}
