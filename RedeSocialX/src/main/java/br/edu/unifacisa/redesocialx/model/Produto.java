package br.edu.unifacisa.redesocialx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @Genera@tedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private double valor;
    private int qtdAmigo;

    public int getQtdAmigos() {
        return qtdAmigos;
    }

    public void setQtdAmigos(int qtdAmigos) {
        this.qtdAmigos = qtdAmigos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}