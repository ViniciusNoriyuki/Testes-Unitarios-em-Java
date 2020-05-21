package br.com.ibm.treinamento.testes;

import br.com.ibm.treinamento.testes.calculos.Fatorial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FatorialTest {

    @Mock
    private Operacoes operacoes;

    private Fatorial fatorial;

    @Before
    public void setup(){
        fatorial = new Fatorial(operacoes);
    }

    @Test
    public void deveCalcularFatorial(){
        //given
        Double numero = 5D;

        //when
        Double resultado = fatorial.calcularFatorial(numero);

        //then
        Assert.assertEquals(resultado, (Double) 120D);
    }
}
