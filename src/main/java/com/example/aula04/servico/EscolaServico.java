package com.example.aula04.servico;

import java.util.List;

import com.example.aula04.entidade.Escola;
import com.example.aula04.repository.EscolaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscolaServico {

@Autowired
private EscolaRepository er;

public void salvaescola(Escola escola)
{
    er.save(escola);
}

public List<Escola> todasescolas()
{
    return er.findAll();
}

}