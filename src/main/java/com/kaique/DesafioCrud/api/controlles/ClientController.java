package com.kaique.DesafioCrud.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.DesafioCrud.domain.dto.conversores.ClientDtoConversor;
import com.kaique.DesafioCrud.domain.dto.request.ClientDtoRequest;
import com.kaique.DesafioCrud.domain.dto.responce.ClientDtoResponce;
import com.kaique.DesafioCrud.domain.services.ClientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService service;

	@Autowired
	private ClientDtoConversor conversor;

	@GetMapping
	private List<ClientDtoResponce> list() {
		return conversor.listaDto(service.lista());
	}

	@GetMapping("/{id}")
	private ClientDtoResponce buscar(@PathVariable Long id) {
		return conversor.converteClient(service.buscaPorId(id));
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	private ClientDtoResponce adicionar(@Valid @RequestBody ClientDtoRequest dtoRequest) {
		return conversor.converteClient(service.adicionar(dtoRequest));
	}

	@PutMapping("/{id}")
	private ClientDtoResponce atualizar(@PathVariable Long id, @Valid @RequestBody ClientDtoRequest dtoRequest) {
		return conversor.converteClient(service.atualizar(id, dtoRequest));
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	private void atualizar(@PathVariable Long id) {
		service.deletar(id);
	}
}
