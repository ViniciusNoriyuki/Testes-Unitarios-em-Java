package br.com.ibm.treinamento.testes.templates;

import br.com.ibm.treinamento.testes.cliente.ClienteOrigem;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ClienteOrigemTemplate implements TemplateLoader {

    public static final String CLIENTE_ORIGEM_VALIDO = "cliente origem valido";
    public static final String CLIENTE_ORIGEM_INVALIDO = "cliente origem invalido";
    public static final String CLIENTE_ORIGEM_NULL = "cliente origem null";

    @Override
    public void load() {
        Fixture.of(ClienteOrigem.class).addTemplate(CLIENTE_ORIGEM_VALIDO, new Rule(){{
            add("nome", "Vinicius");
            add("cpf", "999.999.999-99");
            add("idade", 25);
            add("sexo", "masculino");
            add("telefone", "9999-9999");
            add("endereco", "Rua Um");
        }}).addTemplate(CLIENTE_ORIGEM_INVALIDO, new Rule(){{
            add("nome", 123);
            add("cpf", "999.999.999-99");
            add("idade", 25);
            add("sexo", "masculino");
            add("telefone", "9999-9999");
        }});
    }
}
