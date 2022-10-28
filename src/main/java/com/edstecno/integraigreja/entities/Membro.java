package com.edstecno.integraigreja.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Membro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Date nascimento;

    private String endereco;

    private String telefone;

    private String conjuge;

    private String pgm;

    private String filhos;

    @OneToOne
    @JoinColumn(name = "igreja_id")
    private Igreja igreja;

    public Membro(Long id, String nome, Date nascimento, String endereco, String telefone, String conjuge, String pgm, String filhos, Igreja igreja) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.conjuge = conjuge;
        this.pgm = pgm;
        this.filhos = filhos;
        this.igreja = igreja;
    }

    public Membro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public String getPgm() {
        return pgm;
    }

    public void setPgm(String pgm) {
        this.pgm = pgm;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public Igreja getIgreja() {
        return igreja;
    }

    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membro membro = (Membro) o;
        return Objects.equals(id, membro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
