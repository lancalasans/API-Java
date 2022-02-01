package com.example.experian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.experian.model.Cadastro;

@Repository
public interface PessoaRepository extends JpaRepository<Cadastro, Long> {

}
