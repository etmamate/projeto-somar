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


    //Listar usuarios salvos
    public List<Usuario> listarUsuarios(){return usuarioRepository.findAll();}

    //Salvar novos usuarios
    public Usuario salvarUsuario(Usuario usuario){return usuarioRepository.save(usuario);}

    //Deletar usuario
    public void delete(Long id){usuarioRepository.deleteById(id);}
}
