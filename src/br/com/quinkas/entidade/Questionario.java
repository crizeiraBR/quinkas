/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author erick
 */
public class Questionario {
    private Integer id;
    private Professor professor;
    private String nome;
    private Date datacriacao;
    private List<Pergunta> perguntas;
    private List<Materia> materias;

    public Questionario() {
        this.perguntas = new ArrayList<Pergunta>();
        this.materias = new ArrayList<Materia>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    public String toString() {
        return this.nome;
    }
}
