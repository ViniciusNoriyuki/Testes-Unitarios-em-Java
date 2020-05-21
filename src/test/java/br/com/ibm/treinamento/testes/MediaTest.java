package br.com.ibm.treinamento.testes;

import br.com.ibm.treinamento.testes.calculos.Media;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MediaTest {

    @Mock
    private Operacoes operacoes;

    private Media media;

    @Before
    public void setup(){
        media = new Media(operacoes);
    }

    @Test
    public void deveCalcularMedia(){
        //given
        Double total = 10D;

        //when
        when(operacoes.soma(anyDouble(), anyDouble())).thenReturn(total);
        Double resultado = media.calcularMedia(5D, 5D);

        //then
        Assert.assertEquals(resultado, (Double) 5D);
        verify(operacoes, times(1)).soma(anyDouble(), anyDouble());
    }
}
