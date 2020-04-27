package com.example.aula04.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/**
 * Escola
 */
@Entity
public class Escola implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_escola;
    private String name;
    @OneToMany
    @JoinColumn(name="ID_ESCOLA")
    private List<Curso> cursos;
    private String endereco;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId_escola() {
        return id_escola;
    }

    public void setId_escola(int id_escola) {
        this.id_escola = id_escola;
    }

    public Escola(String name, String endereco) {
        this.name = name;
        this.endereco = endereco;
    }
    public Escola()
    {
        
    }

    @Override
    public String toString() {
        return "Escola [endereco=" + endereco + ", name=" + name + "]";
    }


    
}