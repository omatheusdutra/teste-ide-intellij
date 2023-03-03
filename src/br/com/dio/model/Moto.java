package br.com.dio.model;

import java.util.Objects;

public class Moto {
    private String nome;
    private String cor;
    private String ano;

    public Moto() {}

    public Moto(String nome, String cor, String ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(nome, moto.nome) && Objects.equals(cor, moto.cor) && Objects.equals(ano, moto.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, ano);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
