package com.supraprime.supraprime.repository;

import com.supraprime.supraprime.model.DadosUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosUsuarioRepository extends JpaRepository<DadosUsuario,Long> {

}
