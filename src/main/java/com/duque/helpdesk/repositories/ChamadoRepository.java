package com.duque.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duque.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
