package br.com.ibm.treinamento.testes;

import br.com.ibm.treinamento.testes.cliente.ClienteDestino;
import br.com.ibm.treinamento.testes.cliente.ClienteOrigem;
import br.com.ibm.treinamento.testes.mapper.ClienteMapper;
import br.com.ibm.treinamento.testes.templates.ClienteOrigemTemplate;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MapperTest {

    @Before
    public void setup(){
        FixtureFactoryLoader.loadTemplates("br.com.ibm.treinamento.testes.templates");
    }

    @Test
    public void deveConverterClienteOrigemParaDestino(){
        //given
        ClienteOrigem clienteOrigem = Fixture.from(ClienteOrigem.class).gimme(ClienteOrigemTemplate.CLIENTE_ORIGEM_VALIDO);

        //when
        ClienteDestino clienteDestino = ClienteMapper.INSTANCE.converterOrigemParaDestino(clienteOrigem);

        //then
        Assert.assertEquals(clienteOrigem.getNome(), clienteDestino.getNome());
        Assert.assertEquals(clienteOrigem.getCpf(), clienteDestino.getCpf());
        Assert.assertEquals(clienteOrigem.getIdade(), clienteDestino.getIdade());
        Assert.assertEquals(clienteOrigem.getSexo(), clienteDestino.getSexo());
        Assert.assertEquals(clienteOrigem.getTelefone(), clienteDestino.getTelefone());
        Assert.assertEquals(clienteOrigem.getEndereco(), clienteDestino.getEndereco());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveGerarIllegalArgumentException(){
        //given
        ClienteOrigem clienteOrigem = Fixture.from(ClienteOrigem.class).gimme(ClienteOrigemTemplate.CLIENTE_ORIGEM_INVALIDO);

        //when
        ClienteDestino clienteDestino = ClienteMapper.INSTANCE.converterOrigemParaDestino(clienteOrigem);
    }

    @Test
    public void deveGerarClienteNull(){
        //given
        ClienteOrigem clienteOrigem = null;

        //when
        ClienteDestino clienteDestino = ClienteMapper.INSTANCE.converterOrigemParaDestino(clienteOrigem);
    }
}
