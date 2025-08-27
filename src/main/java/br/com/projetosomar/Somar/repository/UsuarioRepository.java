package br.com.projetosomar.Somar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetosomar.Somar.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
