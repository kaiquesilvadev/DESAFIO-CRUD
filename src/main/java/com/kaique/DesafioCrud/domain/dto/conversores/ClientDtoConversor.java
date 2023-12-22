package com.kaique.DesafioCrud.domain.dto.conversores;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kaique.DesafioCrud.domain.dto.request.ClientDtoRequest;
import com.kaique.DesafioCrud.domain.dto.responce.ClientDtoResponce;
import com.kaique.DesafioCrud.domain.entities.Client;

@Component
public class ClientDtoConversor {

	@Autowired
	private ModelMapper mapper;

	public ClientDtoResponce converteClient(Client client) {
		return mapper.map(client, ClientDtoResponce.class);
	}

	public Client converteDto(ClientDtoRequest dto) {
		return mapper.map(dto, Client.class);
	}

	public void copia(ClientDtoRequest dto, Client client) {
		mapper.map(dto, client);
	}

	public List<ClientDtoResponce> listaDto(List<Client> list) {
		return list.stream().map(t -> converteClient(t)).toList();
	}
}
