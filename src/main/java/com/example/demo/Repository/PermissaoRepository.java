package com.example.demo.Repository;

import com.example.demo.Entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
    List<Permissao> findByNome(String nome);//buscara  o metodo de busca
}


