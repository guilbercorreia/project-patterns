package com.project.integrationviacep.repositories;

import com.project.integrationviacep.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
