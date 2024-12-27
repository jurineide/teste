package com.jurineide.teste.repositories;

import com.jurineide.teste.entities.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
}
