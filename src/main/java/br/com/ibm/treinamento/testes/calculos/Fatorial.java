package br.com.ibm.treinamento.testes.calculos;

import br.com.ibm.treinamento.testes.Operacoes;

public class Fatorial {
    private Operacoes operacoes;

    public Fatorial(Operacoes operacoes) {
        this.operacoes = operacoes;
    }

    public Double calcularFatorial(Double numero){
        Double fat = 1D;
        for (int i = 1; i <= numero; i++){
            fat = fat * i;
        }
        return fat;
    }
}
