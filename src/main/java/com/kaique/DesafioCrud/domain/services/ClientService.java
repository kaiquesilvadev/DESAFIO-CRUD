package com.kaique.DesafioCrud.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaique.DesafioCrud.domain.dto.conversores.ClientDtoConversor;
import com.kaique.DesafioCrud.domain.dto.request.ClientDtoRequest;
import com.kaique.DesafioCrud.domain.entities.Client;
import com.kaique.DesafioCrud.domain.exception.EntidadeNaoEncontradaException;
import com.kaique.DesafioCrud.domain.repositories.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Autowired
	private ClientDtoConversor conversor;

	public List<Client> lista() {
		return repository.findAll();
	}

	public Client buscaPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException(id));
	}

	@Transactional
	public Client adicionar(ClientDtoRequest dtoRequest) {
		Client client = conversor.converteDto(dtoRequest);
		return repository.save(client);
	}

	@Transactional
	public Client atualizar(Long id, ClientDtoRequest dtoRequest) {
		Client client = buscaPorId(id);
		conversor.copia(dtoRequest, client);
		return repository.save(client);
	}

	@Transactional
	public void deletar(Long id) {
		buscaPorId(id);
		repository.deleteById(id);
	}
}
