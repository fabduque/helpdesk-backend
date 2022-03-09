package com.duque.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duque.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
