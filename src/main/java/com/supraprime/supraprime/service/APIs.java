package com.supraprime.supraprime.service;

import com.supraprime.supraprime.model.DadosUsuario;
import com.supraprime.supraprime.model.ListadeProdutos;
import com.supraprime.supraprime.repository.DadosUsuarioRepository;
import com.supraprime.supraprime.repository.ListadeProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/API")
@CrossOrigin(origins = "*")
public class APIs {

    @Autowired
    private DadosUsuarioRepository repository;

    @Autowired
    private ListadeProdutosRepository repositoryProdutos;

    @GetMapping("/GET")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<DadosUsuario> getAllDadosUsuario(){
        return repository.findAll();
    }

    @GetMapping("/GET/Produtos")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ListadeProdutos> getAllListadeProdutos(){
        return repositoryProdutos.findAll();
    }
}
