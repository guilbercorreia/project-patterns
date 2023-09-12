package com.project.integrationviacep.services;

import java.util.List;

import com.project.integrationviacep.model.Cliente;

public interface ClienteService {
    
    List<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}
