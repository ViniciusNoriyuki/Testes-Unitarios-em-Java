package br.com.ibm.treinamento.testes.calculos;

import br.com.ibm.treinamento.testes.Operacoes;

public class Media {
    private Operacoes operacoes;

    public Media(Operacoes operacoes) {
        this.operacoes = operacoes;
    }

    public Double calcularMedia(Double numero1, Double numero2){
        Double total =  operacoes.soma(numero1, numero2);
        return total / 2;
    }
}
