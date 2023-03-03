package br.com.dio;

import br.com.dio.model.Moto;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Moto moto = new Moto();
        System.out.println(moto);

        Campeonato Campeonato = new Campeonato( "AMA Motocross", 12);
        System.out.println(Campeonato);

        /*int a = 3;
        int b = 5;
        System.out.println("Hello World!  " + (a+b));*/
    }
}

class Campeonato {
    private String nome;
    private Integer numEtapas;

    public Campeonato(String nome, Integer numEtapas) {
        this.nome = nome;
        this.numEtapas = numEtapas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumEtapas() {
        return numEtapas;
    }

    public void setNumEtapas(Integer numEtapas) {
        this.numEtapas = numEtapas;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "nome='" + nome + '\'' +
                ", numEtapas=" + numEtapas +
                '}';
    }
}
