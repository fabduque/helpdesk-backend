package com.duque.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duque.helpdesk.domain.Chamado;
import com.duque.helpdesk.domain.Cliente;
import com.duque.helpdesk.domain.Tecnico;
import com.duque.helpdesk.domain.enums.Perfil;
import com.duque.helpdesk.domain.enums.Prioridade;
import com.duque.helpdesk.domain.enums.Status;
import com.duque.helpdesk.repositories.ChamadoRepository;
import com.duque.helpdesk.repositories.ClienteRepository;
import com.duque.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "02623051003", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "12485123080", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
