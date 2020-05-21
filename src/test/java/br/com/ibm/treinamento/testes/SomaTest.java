package br.com.ibm.treinamento.testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomaTest {

    private Operacoes operacoes;

    @Before
    public void setup(){
        operacoes = new Operacoes();
    }

    @Test
    public void deveFazerSoma(){
        //given
        Double numero1 = 5D;
        Double numero2 = 5D;

        //when
        Double resultado = operacoes.soma(numero1, numero2);

        //then
        Assert.assertEquals((Double) 10D, resultado);
    }
}
