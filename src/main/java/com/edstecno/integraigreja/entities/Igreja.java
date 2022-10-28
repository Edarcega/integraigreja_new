package com.edstecno.integraigreja.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Igreja implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String denominacao;

    private String email;
    private String cnpj;
    private String logradouro;
    private String cidade;
    private String uf;
    private String cep;
    private String numero;
    private String complemento;
    private String telefone;

    private String matriz;

    private LocalDate dataCadastro;

    public Igreja() {
    }

    public Igreja(Long id, String nome, String denominacao, String email, String cnpj, String logradouro, String cidade, String uf, String cep, String numero, String complemento, String telefone, String matriz, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.denominacao = denominacao;
        this.email = email;
        this.cnpj = cnpj;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.telefone = telefone;
        this.matriz = matriz;
        this.dataCadastro = dataCadastro;
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

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getEmail() {
        return email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Igreja other = (Igreja) obj;
        return Objects.equals(cnpj, other.cnpj) && Objects.equals(id, other.id);
    }

}
