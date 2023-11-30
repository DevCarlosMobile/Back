package com.supraprime.supraprime.repository;

import com.supraprime.supraprime.model.DadosUsuario;
import com.supraprime.supraprime.model.ListadeProdutos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListadeProdutosRepository extends JpaRepository<ListadeProdutos,Long> {
}
