package com.supraprime.supraprime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@Table(name="DADOS_USUARIO")
public class DadosUsuario implements Serializable {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="username")
    private String userName;

    @Column(name="senha")
    private String senha;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column (name="telefone")
    private String telefone;

    @Column (name="data_niver")
    private Timestamp data_niver;

    @Column (name="genero")
    private String genero;

    @Column (name="enderecao")
    private String enderecao;

    @Column (name="pais")
    private String pais;

    @Column (name="cidade")
    private  String cidade;

    @Column (name="regiao")
    private String regiao;

    @Column (name="cep")
    private String cep;

    public DadosUsuario (){

    }


}
