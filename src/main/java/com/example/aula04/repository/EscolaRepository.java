package com.example.aula04.repository;

import com.example.aula04.entidade.Escola;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EscolaRepository
 */
@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {

    

}