package com.kratos.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {


   private String nome;
   private String documento;
   private BigDecimal rendimentosAnual;
   private TipoPessoa tipo = TipoPessoa.FISICA;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return documento.equals(pessoa.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

    public String getNome() {
        return nome;
    }

    public Pessoa(){

    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public BigDecimal getRendimentosAnual() {
        return rendimentosAnual;
    }

    public void setRendimentosAnual(BigDecimal rendimentosAnual) {
        this.rendimentosAnual = rendimentosAnual;
    }
}
