package com.project.integrationviacep.repositories;

import com.project.integrationviacep.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
