package com.supraprime.supraprime.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name="Lista_de_Produtos")
public class ListadeProdutos implements Serializable {

    @Id
    @Column(name="ID")
    private Long id;


    @Column(name="nome")
    private String nome;


    @Column (name="imagem")
    private String imagem;

    @Column (name="avaliacao")
    private String avaliacao;

    @Column(name="preco")
    private String preco;


    public ListadeProdutos (){

    }

}
