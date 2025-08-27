package br.com.projetosomar.Somar.model;

import java.security.Timestamp;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String tipo_perfil;
    private String telefone;
    private String endereco;
    private Timestamp criado_em;

    public Usuario(){
        
    }

    public Usuario(Long id, String nome, String email, String tipo_perfil, String telefone, String endereco,
            Timestamp criado_em) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipo_perfil = tipo_perfil;
        this.telefone = telefone;
        this.endereco = endereco;
        this.criado_em = criado_em;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipo_perfil() {
        return tipo_perfil;
    }
    public void setTipo_perfil(String tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Timestamp getCriado_em() {
        return criado_em;
    }
    public void setCriado_em(Timestamp criado_em) {
        this.criado_em = criado_em;
    }

    

}
